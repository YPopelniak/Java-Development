package task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
//        prettyPrintApple(inventory,simpleFormatter);

       // prettyPrintOrange(inventory =  orange -> "An orange of " + orange + "g");

        System.out.println("*************");

        Predicate<Orange> heavyOrangePredicate = orange -> orange.getWeight() > 150;
        Predicate<Orange> lightOrangePredicate = orange -> orange.getWeight() <= 150;


        prettyPrintOrange(inventory, heavyOrangePredicate, "Heavy");
        prettyPrintOrange(inventory, lightOrangePredicate, "Light");
    }

    private static void prettyPrintOrange(List<Orange> inventory, Predicate<Orange> orangePredicate, String characteristic) {
        for (Orange orange : inventory) {
            if (orangePredicate.test(orange)) {
                System.out.println("A " + characteristic + " " + orange.getColor() + " orange");
            }
        }
    }
}