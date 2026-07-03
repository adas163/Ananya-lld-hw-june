package coffeeMachine.decorators.addOns;

import coffeeMachine.base.Coffee;
import coffeeMachine.decorators.CoffeeDecorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}
