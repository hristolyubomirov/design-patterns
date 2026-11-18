package creational.Factory;

public class Boat implements Transport{


    public Transport createTransport(){
        return new Boat();
    }
    @Override
    public void deliver(){
        System.out.println("Deliver on sea.");
    }
}
