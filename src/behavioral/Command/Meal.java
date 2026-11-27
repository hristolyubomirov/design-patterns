package behavioral.Command;

public class Meal {
    public Order order;
    public String name;

    public Meal(Order order){
        this.order = order;
        this.name = String.join(", ",order.orderList);

    }


}
