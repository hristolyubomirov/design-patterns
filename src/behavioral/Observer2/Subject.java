package behavioral.Observer2;

public interface Subject {

    public void addObserver(RObserver observer);
    public void notifyObserver();
    public void removeObserver(RObserver observer);

}
