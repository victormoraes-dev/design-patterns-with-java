package victormoraes.dev.pattern.strategy.examples.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentContextTest {
    @Test
    public void testPayPalPayment() {

        PaymentStrategy paypalStrategy = new PayPalPaymentStrategy("paypal@example.com");
        PaymentContext paymentContext = new PaymentContext(paypalStrategy);

        var paymentMessage = paymentContext.processPayment(100);

        assertEquals("Using Paypal email strategy. Email: paypal@example.com and amount $100,00", paymentMessage);
    }

    @Test
    public void testStripePayment() {

        PaymentStrategy stripeStrategy = new StripePaymentStrategy("stripe_api_key");
        PaymentContext paymentContext = new PaymentContext(stripeStrategy);

        var paymentMessage = paymentContext.processPayment(200);

        assertEquals("Processing Stripe payment of $200,00 for apiKey stripe_api_key", paymentMessage);
    }

    @Test
    public void testCustomPayment() {

        PaymentStrategy customStrategy = new CustomPaymentStrategy("custom_param");
        PaymentContext paymentContext = new PaymentContext(customStrategy);

        var paymentMessage = paymentContext.processPayment(300);

        assertEquals("Processing custom payment of $300,00 with param: custom_param", paymentMessage);
    }
}
