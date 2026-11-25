package behavioral.ChainOfResponsibility;

public class SeniorHandler implements Handler{
    public Handler next;
    public Status status;
    public Handler prevDev;
    public SeniorHandler(){

        this.status = Status.OPEN;
    }

    @Override
    public void setPrevDev(Handler prevDev){
        if(this.prevDev == null){
            this.prevDev = prevDev;
        }
    }
    @Override
    public void setNext(Handler handler){
        this.next=handler;
    }
    @Override
    public void handle(Request request){


        if(this.status == Status.OCCUPIED){
            //go next
            next.handle(request);
        }
        else if(request.requestLevel != RequestLevel.HARD) {
            //go prev
            prevDev.handle(request);
        }else{

        request.requestStatus = RequestStatus.DONE;
        display(request);}
    }

    public void display(Request request){
        System.out.println("Request: " + request.id + " with level: " + request.requestLevel + "was handled by: Senior dev.");
    }

}
