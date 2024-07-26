package java8.fun_interface;

public interface LambdaTest {
    int test();
}

class Test {


    public static void main(String[] args) {

        LambdaTest test = () -> {
            System.out.println("Testing :");
            return 1;
        };
        System.out.println(test.test());
        int s = test.test();
        System.out.println(s + 1);
    }

}