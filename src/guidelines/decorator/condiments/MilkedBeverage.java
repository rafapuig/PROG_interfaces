package guidelines.decorator.condiments;

import guidelines.decorator.Beverage;
import guidelines.decorator.CondimentedBeverage;

public class MilkedBeverage extends CondimentedBeverage {

    public MilkedBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getName() {
        return "Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.0f;
    }
}
