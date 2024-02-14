package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        //Reference to static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,200);

        // Instance method
        Calculate m1 = (x,y) ->  new Calculator().findMultiple(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiple;
        m2.calculate(3,8);

        Calculate m3 = new Calculator()::findMultiple;
        m3.calculate(6,6);

        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display1 = System.out::println;
        display1.accept(50);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;
                          //what string accept, what does in return


    }
}
