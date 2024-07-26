package basic.patterns.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5; //alternate pattern pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = (n - i) * 2; j > 0; j--) {
                if (j % 2 == 0)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
