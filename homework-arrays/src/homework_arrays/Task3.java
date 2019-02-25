package homework_arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the first number of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = n1;
        int n3;

        System.out.print(n1 + " " + n2);

        int [] array = new int[10];

        for(int i = 0;i<array.length-2;i++)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
