package inheritance.Exercise.exercise2;

public class ShareAsset {

    // this is a redundant coding

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }

    //adds a cost of the fine amount ot his asset
    public void addCost(double cost) {
        totalCost += cost;
    }

    // returns the price per share of this asset

    public double getCurrentPrice() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }


}
