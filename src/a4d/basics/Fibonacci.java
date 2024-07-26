package a4d.basics;

//0 1 1 2 3 5 ... series
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(0 + " " + 1 + " ");
        int a = 0, b = 1, c = 0;
        while (c < 100) {
            c = a + b;
            a = b;
            b = c;
            if (c <= 100)
                System.out.print(c + " ");
        }

    }
}
