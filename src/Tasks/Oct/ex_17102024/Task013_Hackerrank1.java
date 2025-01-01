package Tasks.Oct.ex_17102024;
import java.util.Scanner;
public class Task013_Hackerrank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score: ");
        int score = sc.nextInt();
        char grade = 'F';
        if(score >= 90 && score <=100) {
            grade = 'A';
        } else if (score <= 89 && score >= 80) {
            grade = 'B';
        } else if (score <= 79 && score >= 70) {
            grade = 'C';
        } else if (score <= 69 && score >= 60) {
            grade = 'D';
        } else if (score <= 0 || score > 100) { //Edge Case
            grade = 0;
        } else {
            grade = 'F';
        }
        System.out.println("Grade is "+grade);

        sc.close();

    }
}
