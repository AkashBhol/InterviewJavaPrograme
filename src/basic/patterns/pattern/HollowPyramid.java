package basic.patterns.pattern;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (n - i) * 2; j++) {
                if (j == 1 || j == (n - i) * 2 - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
