package behavioral.ChainOfResponsibility;

public abstract class AbstractHandler implements Handler{
    private Handler next;



    @Override
    public void handle(String request){

    }
}
