package Tasks.Oct.ex_15102024;

public class Task009 {
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        int c = 30;
        int result = a > b || a > b ? a : b > c ? b : c ;
        System.out.println(result);

        // Rough Logic
        // a >=b && a >=c -> a : b >=c -> b : c

        // (a>b)?(a>c?a:c):(b>c?b:c)
        // (a>b && a>c) ? a : (b>a && b>c) ? b: c; it is correct or not?


    }
}
