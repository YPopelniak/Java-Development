import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int reduce = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(reduce);

        // no initial value
        Optional<Integer> reduce2 = numbers.stream().reduce((a, b) -> (a+b));
        System.out.println(reduce2);

        //Max and Min
        Optional<Integer> result = numbers.stream().reduce(Integer::min);
        Optional<Integer> result1 = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(result);
        System.out.println(result1);
        System.out.println("Sum " + sum.get());


      int dishCount =   DishData.getAll().stream()
                .map(dish->1).reduce(0,(a, b) -> (a+b));
        System.out.println(dishCount);

      long dishCount1 =   DishData.getAll().stream().count();
        System.out.println(dishCount1);

    }
}
