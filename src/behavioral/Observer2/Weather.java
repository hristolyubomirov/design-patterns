package behavioral.Observer2;
import java.util.*;
public class Weather implements Subject{
    private String weather;
    private List<RObserver> observerList2;

    public Weather(){
        this.weather = "";
        this.observerList2 = new ArrayList<>();
    }
    public void setWeather(String weather){
        this.weather = weather;
    }

    @Override
    public void addObserver(RObserver observer){
        observerList2.add(observer);
    }
    @Override
    public void removeObserver(RObserver observer){
        observerList2.remove(observer);
    }
@Override
    public void notifyObserver(){
        for (RObserver ro: observerList2)

            ro.update(this.weather);
    }


}
