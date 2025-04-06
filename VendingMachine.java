import java.util.Optional;

public interface VendingMachine {
    Optional<HotDrink> getProduct(String name, int volume, int temperature);
}