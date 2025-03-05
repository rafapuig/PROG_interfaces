package guidelines.decorator.condiments;

import guidelines.decorator.Beverage;
import guidelines.decorator.CondimentedBeverage;

public class ChocolatedBeverage extends CondimentedBeverage {

    static final float CHOCOLATE_COST = 0.5f;

    public ChocolatedBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getName() {
        return "Chocolate";
    }

    @Override
    public float cost() {
        return beverage.cost() + CHOCOLATE_COST;
    }
}
