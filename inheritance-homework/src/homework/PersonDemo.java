package homework;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Pesho", 18, true);
        Person person2 = new Person("Maria", 30, false);

        Person student1 = new Student("Johny", 22, true, 6);
        Person student2 = new Student("Anna", 24, false, 8);

        Person employee1 = new Employee("Gosho", 43, true, 100);
        Person employee2 = new Employee("Petys", 35,false, 150);

        List<Person> people = new ArrayList<>(10);
        people.add(student1);
        people.add(student2);
        people.add(employee1);
        people.add(employee2);
        people.add(person1);
        people.add(person2);

        for (Person people1 : people) {

            if (people1 instanceof Student){
                ((Student) people1).showStudentInfo();
                System.out.println();
            }
            if (people1 instanceof Employee){
                ((Employee) people1).showEmployeeInfo();
                System.out.println();
            }
            if (people1 instanceof Person && !(people1 instanceof Student) && !(people1 instanceof Employee)){
                ((Person) people1).showPersonInfo();
                System.out.println();
            }
        }

        for (Person people2 : people) {

            if (people2 instanceof Employee){
                ((Employee) people2).calculateOvertime(10);
                System.out.println();
            }
        }

    }
}
