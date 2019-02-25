package Tasks_10_and_11;

import java.util.HashSet;
import java.util.Set;

public class College extends Student {

    public void addStudent (String name, double grade, Set<Student> student){
        student = new HashSet<Student>();
        student.add();
    }

    public static void printStudent (Set<Student> student){
        for (Student temp : student) {
            System.out.println(temp);
        }
    }
}
