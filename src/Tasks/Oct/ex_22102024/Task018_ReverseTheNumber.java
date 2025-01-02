package Tasks.Oct.ex_22102024;

public class Task018_ReverseTheNumber {
    public static void main(String[] args) {
        int a = 123456789;
        int r = 0;
        for(;a!=0;){
            int l = a % 10;
            r = r * 10 + l;
            a = a / 10;
        }
        System.out.println("Reversed Number: "+r);
    }
}
