package coffeeMachine.decorators.addOns;

import coffeeMachine.base.Coffee;
import coffeeMachine.decorators.CoffeeDecorator;

public class AlmondMilk extends CoffeeDecorator {
    public AlmondMilk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Almond Milk";
    }

    public double getCost() {
        return coffee.getCost() + 20.0;
    }
}
