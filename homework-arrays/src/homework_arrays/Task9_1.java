package homework_arrays;

import java.util.Scanner;

public class Task9_1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number for the array: ");
            array[i]=scanner.nextInt();
        }
        int[] array_2 = new int[length];

        for(int y=0,k=array.length-1; y<array.length;y++,k--)
            array_2[y]=array[k];

        System.out.print("The reverse order of the Array is:");

        for(int l=0;l<array_2.length;l++)
            System.out.print(" " + array_2[l]);
    }
}
