package Oct.ex_11102024;

public class Lab040_Interview {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PramodDutta

        System.out.println(first_name + last_name + (a + b));
        // BODMAS -
    }
}
