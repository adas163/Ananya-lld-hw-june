package coffeeMachine.decorators.addOns;

import coffeeMachine.base.Coffee;
import coffeeMachine.decorators.CoffeeDecorator;

public class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() { return coffee.getDescription() + ", Caramel"; }
    public double getCost() { return coffee.getCost() + 30.0; }
}
