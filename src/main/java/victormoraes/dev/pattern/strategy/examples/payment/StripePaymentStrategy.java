package victormoraes.dev.pattern.strategy.examples.payment;

import static java.lang.String.format;

public class StripePaymentStrategy implements PaymentStrategy {
    private final String apiKey;

    public StripePaymentStrategy(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String processPayment(double amount) {
        return format("Processing Stripe payment of $%.2f for apiKey %s", amount, apiKey);
    }
}
