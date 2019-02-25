package homework;

public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMan(boolean man) {
        this.isMan=man;
    }

    void showPersonInfo(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        if (isMan==true){
            System.out.println("My gender is male.");
        }
        if (isMan==false){
            System.out.println("My gender is female.");
        }
    }
}
