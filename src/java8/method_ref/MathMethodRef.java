package java8.method_ref;

public interface MathMethodRef {
    void add(int a, int b);


}

class MathTest {
    static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
       /* MathMethodRef methodRef = MathTest::addition;
        methodRef.add(1, 1);*/

        MathMethodRef ref = (a, b) -> System.out.println(addition(a, b));
        ref.add(1,1);
    }

}