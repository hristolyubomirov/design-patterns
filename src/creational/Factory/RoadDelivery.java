package creational.Factory;

public class RoadDelivery extends Factory{
    @Override
    public Transport createTransport(){
        return new Truck();
    }

}
