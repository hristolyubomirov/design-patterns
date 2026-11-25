package behavioral.Strategy;

public class PaypalPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Payment by Paypal: " + amount);
    }
}
