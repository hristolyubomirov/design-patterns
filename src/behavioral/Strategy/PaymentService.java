package behavioral.Strategy;

public class PaymentService {
    private Payment paymentMethod;



    public void setPayment(Payment p){
        this.paymentMethod = p;
    }

    public void checkout(double amount){
        paymentMethod.pay(amount);
    }
}
