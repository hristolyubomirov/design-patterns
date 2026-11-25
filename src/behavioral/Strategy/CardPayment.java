package behavioral.Strategy;

public class CardPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Pay by card: " + amount);
    }

}
