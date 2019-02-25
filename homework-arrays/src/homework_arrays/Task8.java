package homework_arrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number for the array: ");
            array[i]=scanner.nextInt();
        }

        int i;
        int start = 0;
        int len = 1;
        int bestStart = 0;
        int bestlen = 0;

        for (i = 0; i < array.length; i++)
        {
            if (i == 0 || array[i] != array[i-1])
            {
                len = 1;
                start = i;
            }
            else
            {
                len++;
                if (len > bestlen)
                {
                    bestStart = start;
                    bestlen = len;
                }
            }
        }

        System.out.print("The max row of equal numbers is: ");

        for ( i = bestStart; i < bestStart + bestlen; i++ )
            System.out.print(" " + array[i]);
    }
}

