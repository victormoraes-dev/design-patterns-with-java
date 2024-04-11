package victormoraes.dev.pattern.strategy.examples.payment;

public class PaymentContext {
    private final PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String processPayment(double amount) {
        return paymentStrategy.processPayment(amount);
    }
}

