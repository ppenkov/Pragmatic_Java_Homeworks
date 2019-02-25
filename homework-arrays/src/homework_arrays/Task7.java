package homework_arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the first array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number for the first array: ");
            array[i]=scanner.nextInt();
        }

        int x = array[0];
        int y = array[2];

        System.out.print(array[0]+ 1 + " ");
        int [] array2 = new int[length];
        for (int i = 1; i < array2.length; i++){
            array2[i]=x + y;
            x++;
            y++;
            System.out.print(array2[i] + " ");
        }
    }
}
