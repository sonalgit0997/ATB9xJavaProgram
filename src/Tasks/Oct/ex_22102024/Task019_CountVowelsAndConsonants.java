package Tasks.Oct.ex_22102024;

public class Task019_CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "Count the vowels and consonants in the string";
        s = s.toLowerCase();
        int v = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u'){
                v++;
            } else if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                c++;
            }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        }
    }

