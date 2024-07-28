import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<StockObserver> observers;
    private String stockSymbol;
    private double stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    public void registerObserver(StockObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null.");
        }
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    public void setStockInfo(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        stockInfoChanged();
    }

    private void stockInfoChanged() {
        notifyObservers();
    }
}
