package basic.string;

public class SubPalindrome {
   static int a;


    public static void main(String[] args) {
        String s = "malayalam";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                checkSubPalindrome(s1);
            }
        }
    }

    private static void checkSubPalindrome(String i) {
        if (i.equals(new StringBuilder(i).reverse().toString()))
            System.out.println(i);
    }
}
