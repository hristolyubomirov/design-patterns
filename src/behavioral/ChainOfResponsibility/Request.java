package behavioral.ChainOfResponsibility;

import java.util.UUID;

public class Request {
    public String id;
    public RequestLevel requestLevel;
    public String requestDescription;
    public RequestStatus requestStatus;

    public Request(RequestLevel requestLevel, String requestDescription){
        this.id = UUID.randomUUID().toString();
        this.requestLevel = requestLevel;
        this.requestDescription = requestDescription;
        this.requestStatus = RequestStatus.OPEN;
    }

}
