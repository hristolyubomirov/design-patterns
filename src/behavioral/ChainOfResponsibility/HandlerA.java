package behavioral.ChainOfResponsibility;

public class HandlerA implements Handler{
 public Handler next;

    @Override
    public void setNext(Handler handler){
        if (next == null){
            this.next=handler;
        }
    }

}
