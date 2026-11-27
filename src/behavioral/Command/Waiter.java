package behavioral.Command;

import java.util.List;

public class Waiter {
    public Chef kitchenChef = Restaurant.chef;




    public void collectOrder(Order order){

    }

    public Order createOrder(List<String> order){
        return new Order(order);
    }
    public Meal sendOrderToChef(Order order){
        return kitchenChef.receiveOrder(order);
    }
}
