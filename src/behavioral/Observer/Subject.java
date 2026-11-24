package behavioral.Observer;

import java.io.ObjectStreamClass;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
