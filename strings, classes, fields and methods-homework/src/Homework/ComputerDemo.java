package Homework;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer1 = new Computer ();
        Computer computer2 = new Computer();

        computer1.setYear(2000);
        computer1.setPrice(110.50);
        computer1.setNotebook(true);
        computer1.setHardDiskMemory(100);
        computer1.setFreeMemory(80);
        computer1.setOperationSystem("Windows");

        computer2.setYear(2017);
        computer2.setPrice(2000.40);
        computer2.setNotebook(false);
        computer2.setHardDiskMemory(500);
        computer2.setFreeMemory(450);
        computer2.setOperationSystem("Linux");

        computer2.useMemory(100);
        computer1.changeOperationSystem("Linux");

        System.out.println("Computer 1 parameters: Year: " + computer1.getYear() + ", Price: " +
                computer1.getPrice() + ", Is it a laptop: " + computer1.isNotebook() + ", HDD memoty: " + computer1.getHardDiskMemory()
        + ", Free memory: " + computer1.getFreeMemory() + ", Operating System: " + computer1.getOperationSystem());

        System.out.println("Computer 2 parameters: Year: " + computer2.getYear() + ", Price: " +
                computer2.getPrice() + ", Is it a laptop: " + computer2.isNotebook() + ", HDD memoty: " + computer2.getHardDiskMemory()
                + ", Free memory: " + computer2.getFreeMemory() + ", Operating System: " + computer2.getOperationSystem());
    }
}
