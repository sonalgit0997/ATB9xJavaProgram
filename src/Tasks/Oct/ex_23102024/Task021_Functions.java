package Tasks.Oct.ex_23102024;
import java.util.Scanner;
public class Task021_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r1 = sum(a,b);
        System.out.println(r1);
        int r2 = sub(a,b);
        System.out.println(r2);
        int r3 = mul(a,b);
        System.out.println(r3);
        int r4 = div(a,b);
        System.out.println(r4);
        int r5 = mod(a,b);
        System.out.println(r5);

        sc.close();
    }

    static int sum(int a, int b){
        return (a+b);
    }
    static int sub(int a, int b){
        return (a-b);
    }
    static int mul(int a, int b){
        return (a*b);
    }
    static int div(int a, int b){
        return (a/b);
    }
    static int mod(int a, int b){
        return (a%b);
    }
}
