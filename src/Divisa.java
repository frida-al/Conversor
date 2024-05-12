public class Currency {
    public final double conversion;

    public Currency(CurrencyExchangeAPI currencyExchangeAPI) {
        this.conversion = currencyExchangeAPI.conversion_result();
    }

    public double getConversion() {
        return conversion;
    }

}
