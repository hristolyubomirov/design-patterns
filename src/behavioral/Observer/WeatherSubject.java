package behavioral.Observer;

import java.util.ArrayList;
import java.util.*;

public class WeatherSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private String weather="";

    @Override
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for(Observer o: observerList){
            o.update(weather);
        }
    }
    public void setWeather(String newWeather){
        this.weather = newWeather;
        notifyObservers();
    }

}
