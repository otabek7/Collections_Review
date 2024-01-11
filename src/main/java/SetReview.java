import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. Create a Set
        Set<Student> mySet = new HashSet<>();

        //2. Add Element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println("first repeating: " + firstRepeatingChar("java developer"));

    }

    public static Character firstRepeatingChar(String str){
        //Create a HashMap
        Set<Character> charSet = new HashSet<>();

        //Iteration return char if add returns 'false'
        for (Character charTemp: str.toCharArray()){
            if(!charSet.add(charTemp))
                return charTemp;

        }
        return null;
    }
}
