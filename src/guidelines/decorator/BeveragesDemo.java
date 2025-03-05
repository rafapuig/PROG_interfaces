package guidelines.decorator;

import guidelines.decorator.beverages.Decaf;
import guidelines.decorator.beverages.Expresso;
import guidelines.decorator.condiments.ChocolatedBeverage;
import guidelines.decorator.condiments.MilkedBeverage;
import guidelines.decorator.condiments.WhippedBeverage;

public class BeveragesDemo {

    public static void main(String[] args) {

        Beverage decaf = new Decaf();
        Beverage expresso = new Expresso();

        Beverage expressoWithChocolate = new ChocolatedBeverage(expresso);
        Beverage expressoWithCochoWithWhip = new WhippedBeverage(expressoWithChocolate);

        Beverage beverage = new ChocolatedBeverage(new ChocolatedBeverage(new WhippedBeverage(new Decaf())));
        Beverage expressoWithMilkAndChocolate = new MilkedBeverage(new ChocolatedBeverage(new Expresso()));

        printCost(decaf);
        printCost(expresso);
        printCost(expressoWithChocolate);
        printCost(expressoWithCochoWithWhip);
        printCost(beverage);
        printCost(expressoWithMilkAndChocolate);

    }

    static void printCost(Beverage bebida) {
        System.out.println(
                bebida.getDescription() + " cuesta " + bebida.cost() + " euros"
        );
    }
}
