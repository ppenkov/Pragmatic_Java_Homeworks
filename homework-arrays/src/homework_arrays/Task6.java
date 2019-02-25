package homework_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the first array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number for the first array: ");
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the length of the second array: ");
        int length2 = scanner.nextInt();
        int [] array2 = new int[length2];

        for (int i = 0; i < array2.length; i++){
            System.out.println("Enter a number for the second array: ");
            array2[i]=scanner.nextInt();
        }

        if (array.length == array2.length){
            System.out.println("The arrays have the same length.");
        }
        else
        {
            System.out.println("The arrays don't have the same length.");
        }

        boolean areEqual = Arrays.equals(array, array2);

        if (areEqual==true){
            System.out.println("The two arrays are equal.");
        }
        else
        {
            System.out.println("The two arrays are not equal.");
        }
    }
}
