package victormoraes.dev.pattern.strategy.examples.payment;

import static java.lang.String.format;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private final String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public String processPayment(double amount) {

        return format("Using Paypal email strategy. Email: %s and amount $%.2f", email, amount);
    }
}