public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.pay(100.0);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(200.0);
    }
}
