package behavioral.Command;

public class Table {
    private String tableName;
    private Waiter assignedWaiter;
    private Client client;

    public Table(String name){
        this.tableName = name;

    }

    public void assignWaiter(Waiter waiter){
        this.assignedWaiter = waiter;
    }

    public Waiter callWaiter(){
        return this.assignedWaiter;
    }
}
