package a3d.basics;

public class Palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        if (isPalindrome(s))
            System.out.println(s + " : is palindrome");
        else System.out.println(s + " : is not palindrome");
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
