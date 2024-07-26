package basic.patterns;

public final class Immutable {

    private final int a;

    public Immutable(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "{ a = " + a + " }";
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable(10);
    }

}

class TestFinal {
    public static void main(String[] args) {
        Immutable immutable = new Immutable(20);
        System.out.println(immutable);
    }

}