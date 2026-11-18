package creational.Factory;

public class SeaDelivery extends Factory{

    @Override
    public Transport createTransport(){
        return new Boat();
    }
}
