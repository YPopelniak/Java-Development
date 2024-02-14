package functionalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //************PREDICATE******************//
        //Java Functional Interface//

        //Predicate interface
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);

        //if only one parameter don't need ()
        Predicate<Integer> lesserThan =  a -> a<18; ////Implementation of test method that belongs to Predicate interface
        Boolean result =  lesserThan.test(50);
        System.out.println(result);

        //************Consumer******************//

        Consumer<Integer> display = b -> System.out.println(b);
        display.accept(50);


        //************BiConsumer******************//
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //************Function******************//
        Function<String,String> fun = s -> "Hello " + s;
        String str =  fun.apply("Julia");
        System.out.println(str);

        //************Supplier******************//
        Supplier<Double> randomValue = () -> Math.random();
        Double db =  randomValue.get();
        System.out.println(db);

        Predicate<Integer> pred = (p) -> p % 2 == 0;
        System.out.println(pred.test(10));

        BiConsumer<Integer,String> bn = (x,y) -> System.out.println(x+y);
        bn.accept(10,"Apple");




        }
    }

