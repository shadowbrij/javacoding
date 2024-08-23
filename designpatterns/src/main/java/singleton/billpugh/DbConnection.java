package singleton.billpugh;

public class DbConnection {
    private DbConnection(){
        //private constructor
    }
    private static DbConnection getInstance(){
        return BillPughSaid.INSTANCE;
    }

    //suggested by Bill Pugh to use inner static class
    private static class BillPughSaid{
        private static final DbConnection INSTANCE = new DbConnection();
    }
}
