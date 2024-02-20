import com.google.gson.Gson;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException, MalformedURLException, ProtocolException {
        JPanel panel = new JPanel();
        JTextField curFromField = new JTextField(5);
        JTextField curToField = new JTextField(5);
        JTextField amountField = new JTextField(5);

        panel.add(new JLabel("From:"));
        panel.add(curFromField);

        panel.add(new JLabel("To:"));
        panel.add(curToField);

        panel.add(new JLabel("Amount:"));
        panel.add(amountField);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // BoxLayout is used to stack the components vertically
    

        int confirmDialog = JOptionPane.showConfirmDialog(null, panel, "Currency Converter", JOptionPane.OK_CANCEL_OPTION);
        double amount = 0;
        String curFrom = "";
        String curTo = "";

        if (confirmDialog == JOptionPane.OK_OPTION) {
            curFrom = curFromField.getText();
            curTo = curToField.getText();
            amount = Double.parseDouble(amountField.getText());
        } else {
            JOptionPane.showMessageDialog(null, "You have cancelled the operation");
            System.exit(0);
        }

        String query = "https://v6.exchangerate-api.com/v6/d328b7f3720a61ef126d7096/latest/" + curFrom;

        @SuppressWarnings("deprecation")
        URL url = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String output;
        StringBuilder json = new StringBuilder();
        while ((output = br.readLine()) != null) {
            json.append(output);
        }

        Gson gson = new Gson();

        // Convert JSON to Java Object
        Currency currency = gson.fromJson(json.toString(), Currency.class);
        double rate = currency.getConversion_rates().get(curTo);
        double result = amount * rate;

        JOptionPane.showMessageDialog(null, curFrom + " to " + curTo + ": " + result);

    }
}