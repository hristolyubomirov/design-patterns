package behavioral.Command;

import java.util.List;

public class Client {
    String tableName;
    Waiter myWaiter;


    public void clientSitsOnTable(String tableName){
        
    }

    public Waiter callWaiter(Waiter waiter) {
        return waiter;

    }

    public Waiter callWaiter(){
        restaurant.tables.get(tableName);
    }

    public void makeOrder(List<String> orderList){
        Order order = new Order(orderList);

    }
}
