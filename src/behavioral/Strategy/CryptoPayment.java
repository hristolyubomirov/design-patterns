package behavioral.Strategy;

public class CryptoPayment implements Payment{
    private final static double BITCOIN_RATE = 0.0016;

    @Override
    public void pay(double amount){
        double cryptoAmount = convertToCrypto(amount);
        System.out.println("Payment by crypto: " + cryptoAmount +"BTC");
    }

    public double convertToCrypto(double amount){
        return amount* BITCOIN_RATE;
    }
}
