import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


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

//        List<Apple> simpleFormat = prettyPrintApple(inventory, new AppleFancyFormatter());
//        System.out.println(simpleFormat);
        prettyPrintApple(inventory, apples -> true );

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

    public static void prettyPrintApple(List<Apple> inventory, Predicate<Apple> pr){
        for(Apple apple : inventory){
            if(pr.test(apple)) System.out.println( apple.toString() + " Functionall Interface ");
        }
    }
}

