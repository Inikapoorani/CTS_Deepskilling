package StrategyPatternExample;
interface PaymentStrategy{
    void pay(int amt);
}
class CreditCardPayment implements PaymentStrategy{
    public void pay(int amt){
        System.out.println("paying "+amt+" using credit card");
    }
}
class PayPalPayment implements PaymentStrategy{
    public void pay(int amt){
        System.out.println("paying "+amt+" using paypal");
    }
}
class PaymentContext{
    private PaymentStrategy st;
    public PaymentContext(PaymentStrategy st){
        this.st=st;
    }
    public void pay(int amt){
        st.pay(amt);
    }
}
public class StrategyPattern {
    public static void main(String args[]){
        PaymentContext pc=new PaymentContext(new CreditCardPayment());
        pc.pay(2000);
        PaymentContext pc1=new PaymentContext(new PayPalPayment());
        pc1.pay(3000);
    }
    
}
