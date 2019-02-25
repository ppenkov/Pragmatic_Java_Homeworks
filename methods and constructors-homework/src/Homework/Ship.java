package Homework;

public class Ship {
    private double length;
    private double width;
    private String name;
    private int year;
    private double price;

    Ship motorboat;
    private int motorboatYear;
    private double motorboatPrice;
    private String motorboatName;

    Ship (){
    }

    Ship(double length, double width, String name, int year, double price) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    Ship(int motorboatYear, double motorboatPrice) {
        this.motorboatYear = motorboatYear;
        this.motorboatPrice = motorboatPrice;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMotorboat(Ship motorboat) {
        this.motorboat = motorboat;
    }

    public void setMotorboatYear(int motorboatYear) {
        this.motorboatYear = motorboatYear;
    }

    public void setMotorboatPrice(double motorboatPrice) {
        this.motorboatPrice = motorboatPrice;
    }

    public void setMotorboatName(String motorboatName) {
        this.motorboatName = motorboatName;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public Ship getMotorboat() {
        return motorboat;
    }

    public int getMotorboatYear() {
        return motorboatYear;
    }

    public double getMotorboatPrice() {
        return motorboatPrice;
    }

    public String getMotorboatName() {
        return motorboatName;
    }

    void moveFast(){
        System.out.println(name + " is moving fast in the sea.");
    }
    void moveSlow(){
        System.out.println(name + " is moving slow in the sea.");
    }
    void park(){
        System.out.println(name + " is parking on the coast.");
    }

    void getInShip(String motorboatName, String shipName){
        this.motorboatName = motorboatName;
        this.name = shipName;
        System.out.println(motorboatName + " is getting in the ship: " + shipName);
    }
    void leaveShip(String motorboatName, String shipName){
        this.motorboatName = motorboatName;
        this.name = shipName;
        System.out.println(motorboatName + " is getting out of the ship: " + shipName);
    }
}
