package Oct.ex_17102024_If_Conditions;

import java.util.Scanner;

public class Lab077_Odd_Even_program {
    public static void main(String[] args) {
        // Create a Program - Take user input
        // Check weather the input is even or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        // Modulus -> %
        //   10%2 == Even -> 0
        //   10%2 == Odd -> 1

        if(num%2 == 0){
            System.out.println("Num is -> even");
        }else{
            System.out.println("Num is Odd!");
        }

        sc.close();
    }
}
