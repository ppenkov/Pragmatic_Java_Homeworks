package Tasks_10_and_11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student_Demo {
    public static void main(String[] args) {
        System.out.println("Please enter the name of the student: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter the grade of the student: ");
        double grade = scanner.nextDouble();

        Set<Student> student = new HashSet<Student>();

    }
}
