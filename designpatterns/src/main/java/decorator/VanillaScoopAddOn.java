package decorator;

public class VanillaScoopAddOn implements IceCream {
    IceCream cone;

    public VanillaScoopAddOn(IceCream cone) {
        this.cone = cone;
    }

    @Override
    public int getCost() {
        return 10 + cone.getCost();
    }
    @Override
    public String getDescription() {
        return cone.getDescription() + " with vanilla scoop addon";
    }
}
