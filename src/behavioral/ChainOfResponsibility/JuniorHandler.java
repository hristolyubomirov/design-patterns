package behavioral.ChainOfResponsibility;

public class JuniorHandler implements Handler{
 public Handler next;
 public Status status;
 public Handler prevDev;
    public JuniorHandler(){
        this.status = Status.OPEN;
    }

    /*
    Request comes -> handled by anyone
    -> if dev is ok and open -> handle
    -> if dev is not ok -> find ok
    -> if dev is not open -> find open

     */



    @Override
    public void setPrevDev(Handler prevDev){
        if(this.prevDev == null){
            this.prevDev = prevDev;
        }
    }

    @Override
    public void setNext(Handler handler){
        if (next == null){
            this.next=handler;
        }

    }
    @Override
    public void handle(Request request){
        if(this.status == Status.OCCUPIED){
            //go prev
            this.prevDev.handle(request);
        }
        else if(request.requestLevel != RequestLevel.MODERATE) {
            //go next
            this.next.handle(request);
        }else{

            request.requestStatus = RequestStatus.DONE;
            display(request);}
    }

    public void display(Request request){
        System.out.println("Request: " + request.id + " with level: " + request.requestLevel + "was handled by: Junior dev.");
    }


}
