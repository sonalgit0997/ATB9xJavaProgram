package Oct.ex_25102024_Strings;

public class Lab126_StringImmutableFix {
    public static void main(String[] args) {
        String name = "sonal";
        name = name.toUpperCase();
        // Converts all of the characters in this String to upper case using the rules of the default locale.
        // sonal -> SONAL
        System.out.println(name);
    }
}
