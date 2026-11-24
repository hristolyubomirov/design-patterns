package behavioral.Observer;

public class RealObserver implements Observer{
   private String weather;
    @Override
    public void update(String weather){
        this.weather = weather;
        display();

    }
    public void display(){
        System.out.println("Real Observer 1 - Weather: " + weather);
    }
}
