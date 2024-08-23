package factoryMethod.concept;

public class Client {
    public static void main(String[] args) {
        var childWork = new B();
        childWork.execute();
    }
}
