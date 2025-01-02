package Tasks.Oct.ex_18102024;
import java.util.Scanner;
public class Task017_ConvertersUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice: ");
        int c = sc.nextInt();
        switch(c) {
            case 1:
                System.out.println("Enter the distance in KMs");
                double distance = sc.nextDouble();
                System.out.println("Distance in Miles: "+(distance*0.62137)+" miles");
                break;
            case 2:
                System.out.println("Enter the degree in Fahrenheit");
                double degree = sc.nextDouble();
                System.out.println("Degree in Celsius: "+(degree-32)*5/9);
                break;
            default:
                System.out.println("Invalid Input, enter either 1 or 2");
                break;
        }
        sc.close();
    }
}
