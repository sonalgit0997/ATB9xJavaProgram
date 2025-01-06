package Oct.ex_28102024_String_Functions_Array;

public class Lab129_StringFunctions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15); // a - b-1 means 11 to 14
        System.out.println(roar);

        // substring - many interviews
        String s1 = "Sonal";
        String s2 = s1.concat("Patel");
        System.out.println(s2);


        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);


        String s4 = "Sonal";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5 = " Sonal ";
        System.out.println(s5.trim());

        String s6 = "Sonal";
        System.out.println(s6.indexOf("n"));
        System.out.println(s6.indexOf("l"));

        String s7 = "Sonal";
        System.out.println(s7.contains("on"));
        System.out.println(s7.contains("zy"));

        String s8 = "Sonalpatel";
        System.out.println(s8.lastIndexOf("a"));

        String s9 = "Sonalpatel";
        System.out.println(s9.replace("a","x"));
        System.out.println(s9.replaceAll("a","z"));

        String s10 = "Sonalpatel";
        System.out.println(s10.startsWith("Son"));
        System.out.println(s10.endsWith("el"));
        System.out.println(s10.endsWith("zy"));



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);

    }
}
