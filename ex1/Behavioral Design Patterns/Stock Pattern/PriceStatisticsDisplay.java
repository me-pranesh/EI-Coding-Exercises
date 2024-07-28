import java.util.HashMap;
import java.util.Map;

public class PriceStatisticsDisplay implements StockObserver {
    private Map<String, Double> stockPrices;
    private Map<String, Integer> priceCounts;
    private double maxPrice;
    private double minPrice;
    private double avgPrice;

    public PriceStatisticsDisplay(StockMarket stockMarket) {
        stockMarket.registerObserver(this);
        stockPrices = new HashMap<>();
        priceCounts = new HashMap<>();
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        stockPrices.put(stockSymbol, stockPrice);
        priceCounts.put(stockSymbol, priceCounts.getOrDefault(stockSymbol, 0) + 1);
        calculateStatistics();
        display();
    }

    private void calculateStatistics() {
        maxPrice = stockPrices.values().stream().max(Double::compare).orElse(0.0);
        minPrice = stockPrices.values().stream().min(Double::compare).orElse(0.0);
        avgPrice = stockPrices.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void display() {
        System.out.println("Max Price: $" + maxPrice + ", Min Price: $" + minPrice + ", Avg Price: $" + avgPrice);
    }
}
