package behavioral.Command;

import java.util.List;

public class Waiter {
    public Chef kitchenChef;
    public Meal ReadyMeal;
public Waiter(Chef chef){
    this.kitchenChef=chef;

}
    public void sendOrderToChef(Command command) {
        command.execute();
    }


    public void takeOrder(Order order){

        Command command = new OrderCommand(kitchenChef, order);
        sendOrderToChef(command);

    }
/*
Now the Waiter doesn't need to know:
What a Chef is.
What an OrderCommand is.
How meals are prepared.
 */


}
