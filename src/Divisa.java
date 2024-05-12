public class Divisa {
    public final double conversion;

    public Divisa(CurrencyExchangeAPI currencyExchangeAPI) {
        this.conversion = currencyExchangeAPI.conversion_result();
    }

    public double getConversion() {
        return conversion;
    }

}
