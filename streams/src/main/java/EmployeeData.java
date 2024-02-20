import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<NewEmployee> readAll() {
        return Stream.of(
                new NewEmployee(100, "Mike", "mike@gmail.com", Arrays.asList("2029124536", "2023464768")),
                new NewEmployee(101, "Ozzy", "ozzy@gmail.com", Arrays.asList("7039124536", "7033464768")),
                new NewEmployee(102, "Peter", "peter@gmail.com", Arrays.asList("5169124536", "5163464768"))

        );
    }
}
