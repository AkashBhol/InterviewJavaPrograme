package java8.fun_interface;

public interface Func {
    void doAbstract();

    default void doDefault() {
        System.out.println("Default method implementation");
    }

    static String doStatic() {
        return ("Static method implementation");
    }

}

class Func1 {
    public static void main(String[] args) {
        Func.doStatic();
        Func func = () -> System.out.println("Lambda for Functional interface");
        func.doDefault();
    }
}

class Func2 {
    public static void main(String[] args) {
        Func func = () -> {
        };
        func.doDefault();
    }
}

class Func3 implements Func {
    @Override
    public void doAbstract() {
        System.out.println("abstract implementation");
    }

    @Override
    public void doDefault() {
        System.out.println("Overriding default method");
    }

    public static void doStatic() {
        System.out.println("override static");
    }

    public static void main(String[] args) {
        Func3 func = new Func3();
        func.doAbstract();
        func.doDefault();
        System.out.println(Func.doStatic());
        Func3.doStatic();
    }
}