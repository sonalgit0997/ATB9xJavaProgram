package Oct.ex_16102024_Conditions_Loops;

public class Lab070_Argument_Console {
    public static void main(String[] args) {
        // Create a Program to check wheather Shesheh Trivedi will go to Goa OR NOT
        // Take a input age = Shesheh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.printf("%s , %s ,%s ,%s" , args[0], args[1], args[2], args[3]);
        int age = Integer.parseInt(args[2]);
        System.out.println();
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");

    }
}
