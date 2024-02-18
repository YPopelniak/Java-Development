import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating stream from Array

        String[] courses = {"Java", "JS","C#"};
       Stream<String> coursesStream = Arrays.stream(courses);

       //Creating stream from Collection

        List<String> courseList = Arrays.asList("Java", "TS", "JS");
        Stream<String> coursesStream2 = courseList.stream();


        List<CourseClass> courseClasses = Arrays.asList(
                new CourseClass("Java", 180),
                new CourseClass("DS",101),
                new CourseClass("Spring",102),
                new CourseClass("Microservices",103)

        );

        Stream<CourseClass> myCourseStream = courseClasses.stream();

        Stream<Integer> stream = Stream.of(1,2,3,4);
    }
}
