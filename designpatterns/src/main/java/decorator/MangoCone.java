package decorator;

public class MangoCone implements IceCream{
    @Override
    public int getCost() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "Mango Cone";
    }
}
