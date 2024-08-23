package decorator;

public class CherryAddOn implements IceCream{
    IceCream scoop;

    public CherryAddOn(IceCream withScoop) {
        scoop = withScoop;
    }

    @Override
    public int getCost() {
        return 11 + scoop.getCost();
    }

    @Override
    public String getDescription() {
        return scoop.getDescription()  + " with cherry add on";
    }
}
