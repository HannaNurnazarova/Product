import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HotDrinksVendingMachine implements VendingMachine {
    private Map<String, HotDrink> drinks = new HashMap<>();

    public void addDrink(HotDrink drink) {
        drinks.put(drink.getName(), drink);
    }

    @Override
    public Optional<HotDrink> getProduct(String name, int volume, int temperature) {
        HotDrink drink = drinks.get(name);
        if (drink != null && drink.getVolume() == volume && drink.getTemperature() == temperature) {
            return Optional.of(drink);
        }
        return Optional.empty();
    }
}