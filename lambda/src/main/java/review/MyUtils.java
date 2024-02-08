package review;

import java.util.ArrayList;
import java.util.List;

public class MyUtils<T extends Person> {
    public void printInfo(List<T> personList) {

        for (T person : personList) {
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

    public static <T> T returnLastElement(List<T> list) {
        return list.get(list.size() - 1);

    }
    public void printNames(List<T> personList) {

        for (T person : personList) {

            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));

        MyUtils<Student> myUtils = new MyUtils<>();

        myUtils.printNames(studentList);
        myUtils.printInfo(studentList);

//        MyUtils.returnLastElement()
    }
}

