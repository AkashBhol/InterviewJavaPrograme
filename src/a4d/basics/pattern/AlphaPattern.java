package a4d.basics.pattern;

public class AlphaPattern {
    public static void main(String[] args) {
        int n = 5, i = 0, j = 0;
        while (i < n) {
            while (j <= i) {
                System.out.print((char) (65 + j));
                j++;
            }
            i++;
            j = 0;
            System.out.println();
        }

    }
}
