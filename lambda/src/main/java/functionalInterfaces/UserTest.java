package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        //Print all elements in the list
        //Print all users that last name starts with E

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Julia").lastName("Fun").age(27).build());
        users.add(User.builder().firstName("Tomas").lastName("Eren").age(45).build());
        users.add(User.builder().firstName("Mark").lastName("Tomic").age(29).build());

          //Print all elements in the list
        printName(users, p -> true);

        System.out.println("**************************");

        printName(users, user -> user.getLastName().startsWith("E"));
    }
    private static void printName(List<User> users, Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}