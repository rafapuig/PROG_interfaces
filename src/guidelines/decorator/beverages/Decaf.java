package guidelines.decorator.beverages;

import guidelines.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Cafe descafeinado";
    }

    @Override
    public float cost() {
        return 2.0f;
    }
}
