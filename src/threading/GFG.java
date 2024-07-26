package threading;


public class GFG extends Thread {
    public static void main(String[] args) {
        GFG thread = new GFG();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("New thread" + Thread.currentThread());
    }
}

class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("new thread"));
        thread.start();
    }
}


