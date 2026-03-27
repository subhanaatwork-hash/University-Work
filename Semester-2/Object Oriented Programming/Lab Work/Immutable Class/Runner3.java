final class Currency {
    private final String code;
    private final String symbol;
    private final double exchangeRate;
    
    public Currency(String code, String symbol, double exchangeRate) {
        this.code = code;
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public double getExchangeRate() {
        return exchangeRate;
    }
    
    public double convertToBase(double amount) {
        return amount * exchangeRate;
    }
    
    public String toString() {
        return code + " (" + symbol + ") - Rate: " + exchangeRate;
    }
}
    public class Runner3{
    public static void main(String[] args) {
        Currency usd = new Currency("USD", "$", 1.0);
        Currency eur = new Currency("EUR", "€", 1.18);
        Currency gbp = new Currency("GBP", "£", 1.38);
        Currency jpy = new Currency("JPY", "¥", 0.0091);
        
        double amount = 100;
        
        System.out.println(amount + " " + usd.getCode() + " = " + usd.convertToBase(amount) + " base currency");
        System.out.println(amount + " " + eur.getCode() + " = " + eur.convertToBase(amount) + " base currency");
        System.out.println(amount + " " + gbp.getCode() + " = " + gbp.convertToBase(amount) + " base currency");
        System.out.println(amount + " " + jpy.getCode() + " = " + jpy.convertToBase(amount) + " base currency");
    }
}