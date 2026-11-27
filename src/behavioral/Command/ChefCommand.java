package behavioral.Command;

public class ChefCommand implements Command {

    public Chef chef;
    public Order order;

    public ChefCommand(Chef c, Order o){
        this.chef=c;
        this.order = o;
    }

    @Override
    public void execute(){
        Meal meal = chef.makeMeal(order);
        chef.provideMeal(meal);

    }
}
