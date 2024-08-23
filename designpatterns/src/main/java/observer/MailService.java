package observer;

public class MailService implements INotifyObserver{
    public void registerSelf(){
        UpdateInventoryService.register(this);
    }
    public void unregisterService(){
        UpdateInventoryService.deregister(this);
    }
    @Override
    public void sendNotification() {
        System.out.println("Got Mail");
    }
}
