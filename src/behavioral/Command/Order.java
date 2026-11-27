package behavioral.Command;

import java.util.List;
import java.util.UUID;

public class Order {
    public String id;
    List<String> order;
    public Order(List<String> order){
        this.id = UUID.randomUUID().toString();
        this.order = order;
    }
}
