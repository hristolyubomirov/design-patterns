package behavioral.ChainOfResponsibility;

public interface Handler {
    public void setNext(Handler handler);

    public void handle(String request);
}
