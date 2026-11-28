package behavioral.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {


    private List<Table> tables;
    private List<Waiter> waiters;
    private static final Chef chef = new Chef();

    public Restaurant() {
        this.tables = new ArrayList<>();
        this.waiters = new ArrayList<>();

    }


    public void hireWaiter(Waiter waiter) {
        waiters.add(waiter);
    }

    public void addTable(Table table){
        tables.add(table);
    }

    public void assignWaiterToTable(Table table, Waiter waiter){
        table.assignWaiter(waiter);
    }
    public void assignClientToTable(Table table, Client client){
        table.assignClient(client);
    }
//    public void assignWaiters() {
//        for (Map.Entry<String,Waiter> e :tables.entrySet()){
//                if (e.getValue() == null) {
//                    if (!availWaiters.isEmpty()) {
//                        Waiter waiter = availWaiters.remove(0);
//                        tables.put(e.getKey(), waiter);
//                        System.out.println("Waiter " + waiter + " assigned to table " + e.getKey());
//                    } else {
//                        throw new IllegalStateException("Not available waiters.");
//                    }
//                }
//
//        }
//    }


 public Chef getChef(){
        return chef;
 }

}
