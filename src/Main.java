import coffeeMachine.base.Coffee;
import coffeeMachine.factory.AddonFactory;
import coffeeMachine.factory.CoffeeFactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("=== Coffee Vending Machine ===");
        System.out.println("Choose your base coffee:");
        System.out.println("1. Espresso (₹50)");
        System.out.println("2. Latte (₹70)");

        int base = sc.nextInt();

        Coffee coffee = CoffeeFactory.getCoffee(base);
        boolean addMore = true;
        while (addMore) {
            System.out.println("=== Please Select addons ===");
            System.out.println("1. Milk (₹10)");
            System.out.println("2. AlmondMilk (₹20)");
            System.out.println("3. Sugar (₹5)");
            System.out.println("4. Caramel (₹30)");
            System.out.println("5. Done");
            int addOnChoice = sc.nextInt();

            if (addOnChoice == 5) {
                addMore = false;
            } else {
                try {
                    coffee = AddonFactory.getAddons(addOnChoice, coffee);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid choice, please try again.");
                }
            }
        }
        System.out.println("\n=== Final Order ===");
        System.out.println("Coffee: " + coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

        sc.close();
    }
}