package Tasks.Oct.ex_17102024;

import java.util.Scanner;

public class Task014_Hackerrank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Side 1");
        double s1 = sc.nextDouble();
        System.out.println("Enter the length of Side 2");
        double s2 = sc.nextDouble();
        System.out.println("Enter the length of Side 3");
        double s3 = sc.nextDouble();

        if (s1<=0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Invalid Value");
        } else if (s1 == s2 && s2 == s3 && s3 == s1) {
            System.out.println("The triangle is Equilateral");
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }

        sc.close();

    }
}
