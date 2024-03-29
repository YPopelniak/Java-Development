import java.util.*;
public class ArrayListReview {

    public static void main(String[] args) {

       List <Student> students = new ArrayList<>();

     students.add(new Student(1,"Joe"));
     students.add(new Student(2,"Steven"));
     students.add(new Student(3,"Nick"));

        System.out.println(students);

        //for loop
        for(int i=0; i<students.size();i++) System.out.println(students.get(i));
        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with Iterator Forward........");

        Iterator iter= students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Backwards Iteration
        System.out.println("Printing with Iterator Backwards........");
        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }


        // 3. for each loop
        System.out.println("Printing For each loop..........");
        for(Student student:students) System.out.println(student);

        System.out.println("Printing with Lambda..........");

        // 4. Lambda
        students.forEach(student -> System.out.println(student) );

        // Sorting Elements in List
        System.out.println("Printing with sorted List by comp..........");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);
        System.out.println("Printing with sorted List by Name Desc..........");
        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);


    }
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}