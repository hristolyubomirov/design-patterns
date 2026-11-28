package behavioral.Command;

public class Table {
    private String tableName;
    private Waiter assignedWaiter;
    private Client client;
    private Client assignedClient;

    public Table(String name){
        this.tableName = name;

    }

    public void assignWaiter(Waiter waiter){
        this.assignedWaiter = waiter;
    }

    public Waiter callWaiter(){
        return this.assignedWaiter;
    }

    public void assignClient(Client client) {
        this.assignedClient = client;
        client.sitAtTable(this);
    }
}
