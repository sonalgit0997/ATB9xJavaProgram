package Oct.ex_25102024_Strings;

public class Lab124_StringCreated {
    public static void main(String[] args) {
        String name = "sonal";
        name = "patel";
        name = "sonalpatel";
        name = "sonal"; // SCP

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);



        String name2 = new String("Sonal");
        String name3 = new String("Sonal"); //OA
        String name5 = name2;
    }
}
