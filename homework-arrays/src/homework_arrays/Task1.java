package homework_arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            array[i]=scanner.nextInt();
        }
        findSmallestNumDivisibleBy3(array);
    }
    private static void findSmallestNumDivisibleBy3 (int[] array){
        int minNumber = array[0];
        for (int i = 1; i<array.length; i++) {
            if (array[i] % 3 == 0) {
                if (minNumber > array[i]) {
                    minNumber = array[i];
                }
                System.out.println("The smallest number divisible by 3 is: " + minNumber);
            }
            else
            {
                System.out.println("There is no number divisible by 3 in the array.");
            }
            break;
        }
    }
}
