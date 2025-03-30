import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

interface VendingMachine {
    Optional<HotDrink> getProduct(String name, int volume, int temperature);
}

class HotDrink {
    private String name;
    private int volume;
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinksVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrink(HotDrink hotDrink) {
        if (hotDrink.getVolume() <= 0 || hotDrink.getTemperature() <= 0) {
            throw new IllegalArgumentException("Volume and temperature must be positive.");
        }
        this.hotDrinks.add(hotDrink);
    }

    @Override
    public Optional<HotDrink> getProduct(String name, int volume, int temperature) {
        return hotDrinks.stream()
                .filter(drink -> drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature)
                .findFirst();
    }

    public List<HotDrink> getAvailableDrinks() {
        return new ArrayList<>(hotDrinks);
    }

    @Override
    public String toString() {
        return "HotDrinksVendingMachine{" +
                "hotDrinks=" + hotDrinks +
                '}';
    }
}