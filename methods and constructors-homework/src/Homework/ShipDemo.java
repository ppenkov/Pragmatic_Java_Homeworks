package Homework;

public class ShipDemo {
    public static void main(String[] args) {
        Ship ship1 = new Ship(100.50, 50.60, "Titanic", 1911, 1000000);
        Ship ship2 = new Ship(200.60, 80.35, "Concordia", 2010, 10000000);
        Ship motorboat1 = new Ship(1910, 50);
        Ship motorboat2 = new Ship(2009, 100000);
        motorboat1.setMotorboatName("Speed");
        motorboat2.setMotorboatName("Arrow");


        motorboat1.leaveShip(motorboat1.getMotorboatName(), ship1.getName());
        motorboat2.leaveShip(motorboat2.getMotorboatName(), ship2.getName());
        motorboat1.getInShip(motorboat1.getMotorboatName(), ship1.getName());
        motorboat2.getInShip(motorboat2.getMotorboatName(), ship2.getName());
        ship1.moveFast();
        ship2.moveFast();
        ship1.moveSlow();
        ship2.moveSlow();
        ship1.park();
        ship2.park();
    }
}
