package guidelines.decorator.beverages;

import guidelines.decorator.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        this.description = "Café expreso";
    }

    @Override
    public float cost() {
        return 3.0f;
    }
}
