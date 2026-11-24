package behavioral.Observer2;

import java.sql.SQLOutput;

public interface RObserver {

    public void update(String weather);

    default void validate(String weather){
        if(weather == null || weather.isBlank()){
            throw new IllegalArgumentException("Weather can't be null.");
        }
        System.out.println("Weather - validated by default method.");
    }

}
