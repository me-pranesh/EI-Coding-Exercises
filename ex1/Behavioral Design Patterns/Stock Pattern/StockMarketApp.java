public class StockMarketApp {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        CurrentPriceDisplay currentPriceDisplay = new CurrentPriceDisplay(stockMarket);
        PriceStatisticsDisplay priceStatisticsDisplay = new PriceStatisticsDisplay(stockMarket);

        stockMarket.setStockInfo("AAPL", 150.0);
        stockMarket.setStockInfo("AAPL", 155.0);
        stockMarket.setStockInfo("AAPL", 145.0);
    }
}
