package Oct.ex_21102024_ForLoop;

public class Lab106 {
    public static void main(String[] args) {
        // Continue
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
