package behavioral.Command;

public class OrderCommand implements Command {

    private Chef chef;
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        chef.receiveOrder(order);
    }
}