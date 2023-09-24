import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Product> hotDrinkList = new ArrayList<>();
        HotDrink hotDrink = new HotDrink("Americano", 2.5, 250, 80);
        HotDrink hotDrink00 = new HotDrink("Americano", 2.8, 300, 80);
        HotDrink hotDrink01 = new HotDrink("Americano", 3.0, 400, 80);
        HotDrink hotDrink1 = new HotDrink("Espresso", 2.5, 50, 80);
        HotDrink hotDrink2 = new HotDrink("Latte", 3.2, 300, 70);
        HotDrink hotDrink21 = new HotDrink("Latte", 4, 400, 70);
        HotDrink hotDrink22 = new HotDrink("Latte", 5, 500, 70);
        HotDrink hotDrink3 = new HotDrink("Tea Ulun", 2.0, 250, 75);
        HotDrink hotDrink4 = new HotDrink("Tea whith milk", 3.2, 350, 60);
        HotDrink hotDrink5 = new HotDrink("Coffee Bumble", 3.5, 350, 14);
        hotDrinkList.addAll(Arrays.asList(hotDrink, hotDrink1, hotDrink2, hotDrink4,
                            hotDrink3, hotDrink5, hotDrink00, hotDrink01, hotDrink21, hotDrink22 ));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(hotDrinkList);
        System.out.println(hotDrinkVendingMachine.getProduct("latte", 500, 80));
        System.out.println("--------");
        System.out.println(hotDrinkVendingMachine.getProduct("Latte", 400, 70));
        System.out.println("--------");
        System.out.println(hotDrinkVendingMachine.getProduct("latte"));
        System.out.println("--------");

    }
}
