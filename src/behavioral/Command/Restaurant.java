package behavioral.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {


List<Table> tables;
List<Waiter> waiters;
public static final Chef chef = new Chef();

    public Restaurant(){
        this.tables = new ArrayList<>();
        this.waiters = new ArrayList<>();

    }


    public void hireWaiter(Waiter waiter){
        availWaiters.add(waiter);
    }

    public void assignWaiters() {
        for (Map.Entry<String,Waiter> e :tables.entrySet()){
                if (e.getValue() == null) {
                    if (!availWaiters.isEmpty()) {
                        Waiter waiter = availWaiters.remove(0);
                        tables.put(e.getKey(), waiter);
                        System.out.println("Waiter " + waiter + " assigned to table " + e.getKey());
                    } else {
                        throw new IllegalStateException("Not available waiters.");
                    }
                }

        }
    }


    public void assignTableToClient(String table,Client client){
            clientsOnTable.computeIfAbsent(table, k -> new ArrayList<>())
                    .add(client);
            Waiter currentWaiter = tables.get(table);
            client.callWaiter(currentWaiter);
    }

}
