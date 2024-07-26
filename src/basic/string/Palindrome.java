package basic.string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()));
        System.out.println(new StringBuilder(s).reverse());
    }
}

class Palindrome_2 {
    static String s = "malayalam";

    public static void main(String[] args) {
        boolean b = isPalindrome(s);
        System.out.println(b);
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}