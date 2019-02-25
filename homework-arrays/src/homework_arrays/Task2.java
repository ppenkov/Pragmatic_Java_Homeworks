package homework_arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array divisible by 2: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length/2; i++){
            System.out.println("Enter a number: ");
            array[i]=scanner.nextInt();
        }

        int x = array[0];
        for (int y = array.length/2; y < array.length; y++){
            array[y]=x;
            x++;
        }

        for (int i = 0; i<array.length;i++){
                System.out.print(array[i] + " ");
        }
    }
}
