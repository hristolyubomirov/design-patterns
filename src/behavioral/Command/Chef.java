package behavioral.Command;

public class Chef {


    public Meal receiveOrder(Order order){
        return makeMeal(order);
    }

    public Meal makeMeal(Order order){
        System.out.println("Order "+ order.id + "will be ready in 15 minutes.");
        return new Meal(order);

    }
}
