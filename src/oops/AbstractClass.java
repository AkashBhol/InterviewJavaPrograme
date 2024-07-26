package oops;


public abstract class AbstractClass {
    public AbstractClass() {

    }

    public abstract void add();

    static void add1() {
        System.out.println("Static method in Abstract class");
    }

    void add2() {
        System.out.println("Non static method in Abstract class");
    }

    public AbstractClass(int a, int aq) {
        this.a = a;
        this.aq = aq;
    }

    int a;
    int aq = 5;


    final void sum() {
        System.out.println("I am concrete method !!");
    }

}

class Test extends AbstractClass {

    public Test(int a, int aq) {
        super(a, aq);
    }

    public Test() {
        super();
    }

    @Override
    public void add() {

    }


}
