package behavioral.Observer2;

public class RObserver2 implements RObserver{
    private String weather;


    @Override
    public void update(String weather){
        RObserver.super.validate(weather);
        this.weather=weather;
        display();
    }

    public void display(){
        System.out.println("Weather display of Observer 2: " + this.weather);
    }
}
