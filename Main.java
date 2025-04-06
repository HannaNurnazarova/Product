import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addDrink(new HotDrink("Coffee", 2.5, 200, 90)); // Изменил объем на 200
        vendingMachine.addDrink(new HotDrink("Tea", 2.0, 250, 85)); // Изменил объем на 250

        Optional<HotDrink> drink = vendingMachine.getProduct("Coffee", 200, 90);
        drink.ifPresent(System.out::println);
    }
}