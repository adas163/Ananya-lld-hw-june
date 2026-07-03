package coffeeMachine.factory;

import coffeeMachine.base.Coffee;
import coffeeMachine.base.Espresso;
import coffeeMachine.base.Latte;

public class CoffeeFactory {

    public static Coffee getCoffee(int choice) {
        switch (choice) {
            case 1:
                return new Espresso();
            case 2:
                return new Latte();
            default:
                throw new IllegalArgumentException("Invalid coffee choice");
        }
    }
}
