package homework_arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number for the array: ");
            array[i]=scanner.nextInt();
        }

        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }

        for (int i = 0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
