package observer;

public class SMSService implements INotifyObserver{

    public void registerSelf(){
        UpdateInventoryService.register(this);
    }
    @Override
    public void sendNotification() {
        System.out.println("Got SMS");
    }
}
