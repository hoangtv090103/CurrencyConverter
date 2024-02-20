
class ConversionRates {
    private double USD;
    private double AED;
    private double ARS;
    private double AUD;
    private double BGN;
    private double BRL;
    private double BSD;
    private double CAD;
    private double CHF;
    private double CLP;
    private double CNY;
    private double COP;
    private double CZK;
    private double DKK;
    private double DOP;
    private double EGP;
    private double EUR;
    private double FJD;
    private double GBP;
    private double GTQ;
    private double HKD;
    private double HRK;
    private double HUF;
    private double IDR;
    private double ILS;
    private double INR;
    private double ISK;
    private double JPY;
    private double KRW;
    private double KZT;
    private double MVR;
    private double MXN;
    private double MYR;
    private double NOK;
    private double NZD;
    private double PAB;
    private double PEN;
    private double PHP;
    private double PKR;
    private double PLN;
    private double PYG;
    private double RON;
    private double RUB;
    private double SAR;
    private double SEK;
    private double SGD;
    private double THB;
    private double TRY;
    private double TWD;
    private double UAH;
    private double UYU;
    private double ZAR;
    private double VND;

    public double get(String curTo) {
        switch (curTo) {
            case "USD":
                return USD;
            case "AED":
                return AED;
            case "ARS":
                return ARS;
            case "AUD":
                return AUD;
            case "BGN":
                return BGN;
            case "BRL":
                return BRL;
            case "BSD":
                return BSD;
            case "CAD":
                return CAD;
            case "CHF":
                return CHF;
            case "CLP":
                return CLP;
            case "CNY":
                return CNY;
            case "COP":
                return COP;
            case "CZK":
                return CZK;
            case "DKK":
                return DKK;
            case "DOP":
                return DOP;
            case "EGP":
                return EGP;
            case "EUR":
                return EUR;
            case "FJD":
                return FJD;
            case "GBP":
                return GBP;
            case "GTQ":
                return GTQ;
            case "HKD":
                return HKD;
            case "HRK":
                return HRK;
            case "HUF":
                return HUF;
            case "IDR":
                return IDR;
            case "ILS":
                return ILS;
            case "INR":
                return INR;
            case "ISK":
                return ISK;
            case "JPY":
                return JPY;
            case "KRW":
                return KRW;
            case "KZT":
                return KZT;
            case "MVR":
                return MVR;
            case "MXN":
                return MXN;
            case "MYR":
                return MYR;
            case "NOK":
                return NOK;
            case "NZD":
                return NZD;
            case "PAB":
                return PAB;
            case "PEN":
                return PEN;
            case "PHP":
                return PHP;
            case "PKR":
                return PKR;
            case "PLN":
                return PLN;
            case "PYG":
                return PYG;
            case "RON":
                return RON;
            case "RUB":
                return RUB;
            case "SAR":
                return SAR;
            case "SEK":
                return SEK;
            case "SGD":
                return SGD;
            case "THB":
                return THB;
            case "TRY":
                return TRY;
            case "TWD":
                return TWD;
            case "UAH":
                return UAH;
            case "UYU":
                return UYU;
            case "ZAR":
                return ZAR;
            case "VND":
                return VND;
            default:
                return 0;
        }
    }

}