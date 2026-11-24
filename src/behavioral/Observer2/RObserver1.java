package behavioral.Observer2;

public class RObserver1 implements RObserver{
    public String weather;




    @Override
    public void update(String weather){
        RObserver.super.validate(weather);
        this.weather = weather;

        display();
    }

    public void display(){
        System.out.println("Weather from Observer 1: " +this.weather);
    }

}
