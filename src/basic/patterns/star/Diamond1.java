package basic.patterns.star;

public class Diamond1 {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            Thread.sleep(100);
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

