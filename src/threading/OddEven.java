package threading;

public class OddEven {

    static int n;
    int counter = 1;

    synchronized void printOdd() {
        while (counter < n) {
            while (counter % 2 == 0) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.print(counter + " ");
            counter++;
            notify();
        }
    }

    synchronized void printEven() {
        while (counter < n) {
            while (counter % 2 != 0) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.print(counter + " ");
            counter++;
            notify();
        }
    }

    public static void main(String[] args) {

        OddEven oddEven = new OddEven();
        n = 10;
        Thread t1 = new Thread(() -> oddEven.printEven());
        Thread t2 = new Thread(oddEven::printOdd);
        /*Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEven.printOdd();
            }
        });*/
        t1.start();
        t2.start();
    }
}
