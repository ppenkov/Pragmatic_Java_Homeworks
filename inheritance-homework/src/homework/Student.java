package homework;

public class Student extends Person {

    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score=score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    void showStudentInfo() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        if (isMan==true){
            System.out.println("My gender is male.");
        }
        if (isMan==false){
            System.out.println("My gender is female.");
        }

        if (score < 2 || score > 6){
            System.out.println("Please enter a valid score between 2 and 6!");
        }
        else {
            System.out.println("My score from high school is: " + score);
        }
    }
}
