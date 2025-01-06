package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class Lab137_ArraysWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to create!");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number " + (i+1));
            numbers[i] = sc.nextInt();
        }


        System.out.println(" --- ");
        // Print the numbers entered by the user
        System.out.println("The numbers are:");
//        for (int i = 0; i < numbers.length; i++) {
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }
}
