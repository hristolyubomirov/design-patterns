package behavioral.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private final Map<String,Waiter> tables;
    private final Map<String, List<Client>> clientsOnTable = new HashMap<>();
    public static final Chef chef = new Chef();
    private List<Waiter> availWaiters;
    public Restaurant(){
        this.tables = new HashMap<>();
        for(int i =0;i<10;i++){
            tables.put("table" + String.valueOf(i),null);
        }
        this.availWaiters = new ArrayList<>();
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
