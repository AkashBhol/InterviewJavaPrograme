package java8.fun_interface;

@FunctionalInterface
public interface Lambda2 {
    int addable(int a, int b);
}

class Test1 {
   /* public static void main(String[] args) {

        Lambda2 lambda2 = new Lambda2() {
            @Override
            public int addable(int a, int b) {
                return a+b;
            }
        };
        int result = lambda2.addable(1,1);
        System.out.println(result);
    }*/

    public static void main(String[] args) {
        Lambda2 lambda2 = (a, b) -> (a + b);
        int a = lambda2.addable(1, 2);
        System.out.println(a);
    }


}