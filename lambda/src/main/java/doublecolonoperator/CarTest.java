package doublecolonoperator;

import java.util.function.*;

public class CarTest {
    public static void main(String[] args) {

// ClassName::new
        // Zero argument
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier <Car> c2 = Car::new;
        System.out.println(c2.get().getModel());
        // One argument

        Function<Integer,Car> c3 = (model) -> new Car(model);
        Car bmw = c3.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> c4 = Car::new;
        Car tesla = c3.apply(2015);
        System.out.println(tesla.getModel());

        // Two argument
        BiFunction <String,Integer,Car> b1 = (make, model) -> new Car(make,model);
        Car honda = b1.apply("Honda", 2017);
        System.out.println(honda.getMake() + " " +  honda.getModel());

        BiFunction <String,Integer,Car> b2 = Car::new;
        Car honda1 = b1.apply("Nissan", 2017);
        System.out.println(honda1.getMake() + " " +  honda1.getModel());





    }

}
