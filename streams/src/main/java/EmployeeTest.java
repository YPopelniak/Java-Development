
import java.util.List;
public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails - One employee has one email - One to One

        System.out.println("*********************");
        EmployeeData.readAll()
                .map(NewEmployee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("*********************");
        EmployeeData.readAll()
                .map(NewEmployee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        System.out.println("*********************");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("*********************");
        EmployeeData.readAll()
                .map(NewEmployee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
