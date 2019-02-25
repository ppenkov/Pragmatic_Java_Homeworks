package Homework;

public class Computer {
    private int year;
    private double price;
    private boolean isNotebook;
    private int hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public String getOperationSystem() {
        return operationSystem;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


    void changeOperationSystem(String newOperationSystem) {
        this.operationSystem=newOperationSystem;
    }

    void useMemory(double memory){
        if (memory>this.freeMemory){
            System.out.println("Not enough free memory!");
        }
        this.freeMemory= this.freeMemory-memory;
    }

}
