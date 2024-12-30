package Tasks.Oct.ex_11102024;

import javax.xml.transform.Source;

public class Task005 {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");
        int a = 20;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println();

        System.out.println("Assignment Operators");
        int c1 = 50;
        System.out.println(c1+=c1);
        int c2 = 10;
        System.out.println(c2-=c2);
        int c3 = 12;
        System.out.println(c3*=c3);
        int c4 = 9;
        System.out.println(c4/=c4);
        int c5 = 831;
        System.out.println(c5%=c5);
        System.out.println();

        System.out.println("Concatenation");
        String name = "Sonal";
        String surname = "Patel";
        int s1 = 9;
        int s2 = 8;
        System.out.println(name + surname + s1 + s2);
        System.out.println(s1 + s2 + name + surname);
        System.out.println();

        System.out.println("Relational operators");
        int d1 = 5;
        int d2 = 10;
        System.out.println(d1 == d2);
        System.out.println(d1 != d2);
        System.out.println(d1 > d2);
        System.out.println(d1 < d2);
        System.out.println(d1 >= d2);
        System.out.println(d1 <= d2);
        System.out.println();

        System.out.println("Logical Operator");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);
        System.out.println(b1 && b1);
        System.out.println(b2 && b2);
        System.out.println(b1 || b2);
        System.out.println(b1 || b1);
        System.out.println(b2 || b2);
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
        System.out.println(!false);
        System.out.println(!!!!false);



    }
}
