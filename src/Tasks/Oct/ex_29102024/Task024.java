package Tasks.Oct.ex_29102024;

import java.util.Scanner;

public class Task024 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] n = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            n[i] = sc.nextInt();
        }

        //logic for finding duplicates
        for(int j =0 ; j<n.length ;j++)
        {
            for(int k =j+1 ; k<n.length;k++)
            {
                if(n[j] == n[k])
                {
                    System.out.println("Duplicate found");
                }
            }
        }
    }
}
