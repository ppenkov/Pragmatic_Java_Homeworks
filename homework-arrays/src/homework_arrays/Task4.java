package homework_arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            System.out.println("Enter the length of the array: ");
            Scanner scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i = 0; i < array.length; i++){
                System.out.println("Enter a number: ");
                array[i]=scanner.nextInt();
            }

        System.out.println("The array is mirrored: " + isMirrored(array));
    }

    private static boolean isMirrored(int[] array) {
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            int start = array[i];
            int end = array[--length];
            if (length < i) {
                return true;
            }

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
