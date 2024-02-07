import java.util.ArrayList;
import java.util.List;

public class Appletest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(250, Color.GREEN));
        inventory.add(new Apple(210, Color.RED));
        inventory.add(new Apple(10, Color.GREEN));

        List<Apple> heavyApple = filterList(inventory, new AppleHeavyPredigate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterList(inventory, new AppleGreenColorPredigate());
        System.out.println(greenApple + "---> green Apple");

    }
    private static List<Apple> filterList(List<Apple> inventory, ApplePredigate applePredigate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredigate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}

