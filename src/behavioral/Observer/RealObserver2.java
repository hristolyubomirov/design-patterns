package behavioral.Observer;

public class RealObserver2 implements Observer {
    private String weather;
    @Override
    public void update(String weather){
        this.weather = weather;
        display();

    }
    public void display(){
        System.out.println("Real Observer 2 - Weather: " + weather);
    }
}
