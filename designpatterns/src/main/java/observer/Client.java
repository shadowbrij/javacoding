package observer;

public class Client {
    public static void main(String[] args) {
        new MailService().registerSelf();
        new SMSService().registerSelf();
        new UpdateInventoryService().updateInventory();

        new MailService().unregisterService();

        new UpdateInventoryService().updateInventory();
    }
}
