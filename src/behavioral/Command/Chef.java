package behavioral.Command;

public class Chef {


    public Meal receiveOrder(Order order){
        Meal meal = makeMeal(order);
        provideMeal(meal);
        return meal;
    }

    public Meal makeMeal(Order order){
        System.out.println("Order "+ order.id + "will be ready in 15 minutes.");
        return new Meal(order);

    }

    public void provideMeal(Meal meal){
        System.out.println(meal.name + " is ready.");

    }
}
