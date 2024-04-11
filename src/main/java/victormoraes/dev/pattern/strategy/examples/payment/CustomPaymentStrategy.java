package victormoraes.dev.pattern.strategy.examples.payment;


import static java.lang.String.format;

public class CustomPaymentStrategy implements PaymentStrategy {
    private String customParam;

    public CustomPaymentStrategy(String customParam) {
        this.customParam = customParam;
    }

    @Override
    public String processPayment(double amount) {
        return format("Processing custom payment of $%.2f with param: %s", amount, customParam);
    }
}
