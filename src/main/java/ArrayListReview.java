import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));
        for (int i=0; i<students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println("Printing with an Iterator...");

        //Printing with an iterator forward
        Iterator iter = students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //Printing with an iterator backwards
        System.out.println("Printing with an iterator backwards");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //For each Loop
        System.out.println("Printing with a For Each loop");
        for (Student student: students){
            System.out.println(student);
        }

        //Lambda Expressions
        System.out.println("Printing with a Lambda Expression");
        students.forEach(student -> System.out.println(student));

        //Sorting Elements in a List
        System.out.println("Sorting elements via Collections");
        Collections.sort(students, new sortByNameDescending());
        System.out.println(students);


    }

    static class sortByIdDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
