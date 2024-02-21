import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTask {

    public static void main(String[] args) {

        //Suppose we have a State class that contains list of cities. Create a list
        //of States and print all the cities.

         State va = new State();
         va.addCity("New Orleans");
         va.addCity("Fairfax");
         va.addCity("Arlington");

         State TX = new State();
         TX.addCity("Austin");
         TX.addCity("Dallas");

        List<State> list = Arrays.asList(va,TX);
        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        System.out.println("************************************");
        list.stream().map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);


        ///
    }
}
