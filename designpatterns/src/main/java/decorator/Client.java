package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream cone = new MangoCone();
        IceCream withScoop = new VanillaScoopAddOn(cone);
        IceCream withCherry = new CherryAddOn(withScoop);

        System.out.println(withCherry.getDescription());
        System.out.println(withCherry.getCost());
    }
}
