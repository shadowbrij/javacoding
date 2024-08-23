package observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateInventoryService {
    private static final List<INotifyObserver> observers = new ArrayList<>();
    private void notifySubscribers(){
        for(var service : observers)
            service.sendNotification();
    }

    public void updateInventory(){
        System.out.println("Inventory added. sending notification to all subscribers");
        this.notifySubscribers();
    }
    public static void register(INotifyObserver service){
        observers.add(service);
    }
    public static void deregister(INotifyObserver service){

        //TODO: doesn't work
        for(var regs : observers){
            if(regs.equals(service))
                observers.remove(service);
        }
    }

}
