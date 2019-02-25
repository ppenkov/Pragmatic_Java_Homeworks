package homework;

public class Employee extends Person {

    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary=daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    void calculateOvertime (double hours){
        if (age<18){
            System.out.println("No overtime should be paid.");
        }
        else {
            double overtimeHours;
            overtimeHours = hours - 8;
            if (overtimeHours>=1) {
                System.out.println("The amount of overtime that should be paid to " + name + " is " +
                        (overtimeHours * ((daySalary / 8) * 1.5)) + " euro.");
                                    }
            else{
                System.out.println("The employee hasn't worked any overtime today.");
                }
            }
    }

    void showEmployeeInfo() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        if (isMan==true){
            System.out.println("My gender is male.");
        }
        if (isMan==false){
            System.out.println("My gender is female.");
        }
        System.out.println("My day salary is: " + daySalary + " euro.");
    }
}
