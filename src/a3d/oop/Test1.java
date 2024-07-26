package a3d.oop;

public interface Test1 {
    public abstract void first();

    public static final int a = 10;

    default void second() {
        System.out.println("Default method");
    }

    static void third() {
        System.out.println("Static method");
    }
}

abstract class C1 implements Test1 {
    //   public abstract void first();  //not necessary to override
   // public abstract void second();

    abstract void own();
    @Override
    public void first() {

    }
    C1() {

    }
}

class C2 implements Test1 {

    protected C2() {

    }

    @Override
    public void first() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        C2 c2 = new C2();
        c2.first();
    }
}

class C3 extends C1 {

    @Override
    void own() {

    }
}

class C4 {
  /*  final C4(){
        can not be final constructor
    }*/
}