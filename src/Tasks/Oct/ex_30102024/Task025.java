package Tasks.Oct.ex_30102024;

import java.util.Scanner;

public class Task025 {
    public static void main(String[] args) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
