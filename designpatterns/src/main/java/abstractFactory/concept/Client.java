package abstractFactory.concept;

public class Client {
    public static void main(String[] args) {
        var obj = new IM();
        obj.setRef(new B());
        obj.go();
    }
}
