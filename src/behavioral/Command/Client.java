package behavioral.Command;

import java.util.List;

public class Client {

    private Table table;

    public void sitAtTable(Table table){
        this.table = table;
    }


    public Waiter callWaiter(Waiter waiter) {
        return waiter;

    }



    public void makeOrder(List<String> orderList){
        Order order = new Order(orderList);
    Waiter mywaiter = table.callWaiter();
    mywaiter.takeOrder(order);
    //OrderCommand command = new OrderCommand(order);

    }

    public void receiveMeal(Meal meal){
        eat(meal);
    }
    public void eat(Meal meal){
        System.out.println("Eating " + meal.name);

    }
}
