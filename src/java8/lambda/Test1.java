package java8.lambda;

interface Test {
    void doSome();
}

public class Test1 implements Test {

    @Override
    public void doSome() {
        System.out.println("Implementation class !!!");
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.doSome();
    }
}

class Test2 {
    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void doSome() {
                System.out.println("Anonymous inner class");
            }
        };
        test.doSome();
    }
}

class Test3 {
    public static void main(String[] args) {
        Test test = () -> System.out.println("Lambda implementation");
        test.doSome();
    }
}

class Test4 {
    public static void say() {
        System.out.println("Static method references");
    }

    public static void main(String[] args) {
        Test test = Test4::say;
        test.doSome();
    }
}

class Test5 {
    public void say() {
        System.out.println("Non-static method references");
    }

    public static void main(String[] args) {
        Test test = new Test5()::say;
        test.doSome();
    }
}

class Test6 {
    public static void some() {
        System.out.println("Static method starting Thread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(Test6::some);
        thread.start();
    }
}

class Test7 {
    public void some() {
        System.out.println("Non static method starting thread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test7()::some);
        thread.start();
    }
}

class Test8 {
    void some() {
        System.out.println("Anonymous inner class for thread");
    }

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                test8.some();
            }
        });
        thread.start();
    }
}

class Test9 {
    void some() {
        System.out.println("Method references");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test9()::some);
        thread.start();
    }
}

class Test10 {
    public static void main(String[] args) {
        Test test = () -> System.out.println("Lambda implementation");
        test.doSome();
    }
}

class Test11 {
    void some() {
        System.out.println("Method reference");
    }

    public static void main(String[] args) {
        Test test = new Test11()::some;
    }
}

class Test12 {
    public static void main(String[] args) {
        Test test = () -> System.out.println("Hi I am Lambda expression");
        test.doSome();
    }
}