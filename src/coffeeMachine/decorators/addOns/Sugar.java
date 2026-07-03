package coffeeMachine.decorators.addOns;

import coffeeMachine.base.Coffee;
import coffeeMachine.decorators.CoffeeDecorator;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() { return coffee.getDescription() + ", Sugar"; }
    public double getCost() { return coffee.getCost() + 5.0; }
}
