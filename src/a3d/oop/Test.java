package a3d.oop;

public class Test {
    public static void main(String[] args) {
       T3 t3 = new T3();
    }
}

abstract class T1 {
    abstract void first();

}

abstract class T2 extends T1 {
    abstract void second();
}

class T3 extends T1 {

    @Override
    void first() {
        System.out.println("First");
    }
    void second(){

    }
}
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}