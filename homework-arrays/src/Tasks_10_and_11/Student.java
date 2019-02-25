package Tasks_10_and_11;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private double grade;

    Student () {

    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        Set<Student> student = new HashSet<Student>();
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



}
