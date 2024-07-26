package basic.patterns;

public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
    }

    public Singleton getSingleton() {
        return SINGLETON;
    }

}

class Singleton_2 {
    private static Singleton_2 instance;
    private Singleton_2() {
    }
    public Singleton_2 getInstance(){
        if (instance == null)
            return new Singleton_2();
        return instance;
    }

}
