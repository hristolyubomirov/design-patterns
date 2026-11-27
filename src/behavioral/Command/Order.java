package behavioral.Command;

import java.util.List;
import java.util.UUID;

public class Order {
    public String id;

    public List<String> orderList;
    public Order(List<String> orderList){
        this.id = UUID.randomUUID().toString();
        this.orderList = orderList;
    }
}
