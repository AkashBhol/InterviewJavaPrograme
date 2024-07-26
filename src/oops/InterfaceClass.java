package oops;

public interface InterfaceClass {
    int a = 10;

    void add();
}

interface Dummy {
    int a = 20;

    void add();
}

class TestInterface implements InterfaceClass, Dummy {
    public static void main(String[] args) {
        System.out.println(InterfaceClass.a);
        TestInterface testInterface = new TestInterface();
        ((Dummy) testInterface).add(); //  interface casting or interface type casting
        ((InterfaceClass) testInterface).add();
    }

    @Override
    public void add() {
        System.out.println("Hii");
    }

}