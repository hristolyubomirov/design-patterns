package behavioral.ChainOfResponsibility;

public interface Handler {


    void setNext(Handler handler);

    public void handle(Request request);
    public void setPrevDev(Handler handler);
}
