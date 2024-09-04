package inheritance.Exercise.exercise2;

public class Stocks extends ShareAsset implements Asset{
    public Stocks(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }

    @Override
    public double getMarketValue() {
        return 0;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
