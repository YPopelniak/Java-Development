package review;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));



        List<Teacher> teacherList = new ArrayList<>();


        teacherList.add(new Teacher("Eric", 201));
        teacherList.add(new Teacher("David", 202));
         printInfo(teacherList);
         printInfo(studentList);
    }

    public static void StudentCount (List<Student> studentList) {
        for (Student student : studentList) {
         System.out.println(student);
        }
        System.out.println(studentList.size());
       }
       public static <T> void printInfo(List<T> personList){

        for (T person: personList) {
            System.out.println(person);
        }
           System.out.println(personList.size());
}
    public static <T> T returnLastElement (List <T> list ){
        return list.get(list.size()-1);

    }

}
