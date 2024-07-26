package java8.method_ref;

public interface StaticMethRef {
    int doSomething();
}

class Test {

    static int something() {
        System.out.println("I am concrete method");
        return 1;
    }

    // Method Reference

  /*  public static void main(String[] args) {
        StaticMethRef ref = Test::something;
        System.out.println(ref.doSomething());
    }*/

    // Anonymous class

    /*public static void main(String[] args) {
        StaticMethRef ref = new StaticMethRef() {
            @Override
            public int doSomething() {
                return 0;
            }
        };
    }*/

    //Lambda function

    public static void main(String[] args) {
        StaticMethRef ref = () -> {
            int res = 1;
            return res;
        };
        int res = ref.doSomething();
        System.out.println(res);
    }


}