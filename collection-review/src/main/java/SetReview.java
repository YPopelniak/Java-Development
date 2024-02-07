import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // 1. Empty set
        Set<Student> myset =new HashSet<>();

        myset.add(new Student(7, "Marry"));
        myset.add(new Student(8, "Julia"));
        myset.add(new Student(9, "Maks"));

        System.out.println(myset);
        System.out.println( firstRepeating("Java Development")  + " " + "First Repeating one");

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        //System.out.println(numSet);
        //System.out.println(numSet.add(2));
        // System.out.println("first repeating:  " +firstRepeatingChar("java developer"));


        Set<String> challange =new HashSet<>();

    }
    public static Character firstRepeating(String str) {
        Set<Character> character =new HashSet<>();

        for (Character ch:str.toCharArray()) if (!character.add(ch))
            return ch;
        return null;

    }
}
