package homework_arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        double [] array = new double[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            array[i]=scanner.nextDouble();
        }

        for (int i = 0; i<array.length;i++){
            array[i]=array[i]*3;
            System.out.print(array[i] + " ");
        }
    }
}
