package java8.method_ref;

public interface MethodRefTest {
    void draw();
}
class Circle{
    public static void main(String[] args) {
        MethodRefTest test = Circle :: drawing;
        test.draw();
     }
    static void drawing(){
        System.out.println("I am a circle !!");
    }
}