package coffeeMachine.factory;

import coffeeMachine.base.Coffee;
import coffeeMachine.decorators.addOns.AlmondMilk;
import coffeeMachine.decorators.addOns.Caramel;
import coffeeMachine.decorators.addOns.Milk;
import coffeeMachine.decorators.addOns.Sugar;

public class AddonFactory {

    public static Coffee getAddons(int choice, Coffee coffee) {
        switch (choice) {
            case 1:
                return new Milk(coffee);
            case 2:
                return new AlmondMilk(coffee);
            case 3:
                return new Sugar(coffee);
            case 4:
                return new Caramel(coffee);
            default:
                throw new IllegalArgumentException("Invalid add-on choice");
        }
    }
}
