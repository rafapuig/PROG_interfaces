package guidelines.decorator.condiments;

import guidelines.decorator.Beverage;
import guidelines.decorator.CondimentedBeverage;

public class WhippedBeverage extends CondimentedBeverage {

    public WhippedBeverage(Beverage bebida) {
        super(bebida);
    }

    @Override
    protected String getName() {
        return "Nata";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.5f;
    }
}
