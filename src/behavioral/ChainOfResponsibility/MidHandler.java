package behavioral.ChainOfResponsibility;

public class MidHandler implements Handler{
    public Handler next;
    public Status status;
    public Handler prevDev;

    public MidHandler(){

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
        if(request.requestLevel == RequestLevel.HARD) {
            //go next
            next.handle(request);
        }
        else if(request.requestLevel == RequestLevel.MODERATE){
            prevDev.handle(request);
        }else{

            request.requestStatus = RequestStatus.DONE;
            display(request);}
    }

    public void display(Request request){
        System.out.println("Request: " + request.id + " with level: " + request.requestLevel + "was handled by: Mid dev.");
    }

}
