package AdapterPatternExample;
    interface Paymentprocessor{
    void processPayment(double amount);
}
class PayPal{
    public void sendPayment(double amount){
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
class Stripe{
    public void makePayment(double amount){
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
class PaypalAdapter implements Paymentprocessor{
    private PayPal PaypalGateway;
    public PaypalAdapter(PayPal paypalGateway){
        this.PaypalGateway = paypalGateway;
    }
    public void processPayment(double amount){
        PaypalGateway.sendPayment(amount);
    }
}
class StripeAdapter implements Paymentprocessor{
    private Stripe StripeGateway;
    public StripeAdapter(Stripe stripeGateway){
        this.StripeGateway = stripeGateway;
    }
    public void processPayment(double amount){
        StripeGateway.makePayment(amount);
    }
}
public class Test{
    public static void main(String args[]){
        Paymentprocessor paypalPayment = new PaypalAdapter(new PayPal());
        paypalPayment.processPayment(100.0);
        Paymentprocessor stripePayment = new StripeAdapter(new Stripe());
        stripePayment.processPayment(200.0);
    }
}