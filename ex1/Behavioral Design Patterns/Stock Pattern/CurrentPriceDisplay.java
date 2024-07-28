public class CurrentPriceDisplay implements StockObserver {
    private String stockSymbol;
    private double stockPrice;

    public CurrentPriceDisplay(StockMarket stockMarket) {
        stockMarket.registerObserver(this);
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        display();
    }

    public void display() {
        System.out.println("Current Price of " + stockSymbol + ": $" + stockPrice);
    }
}
