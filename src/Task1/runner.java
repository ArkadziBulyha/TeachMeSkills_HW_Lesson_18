package Task1;

public class runner {

    public static void main(String[] args) {

        Threads thread1 = new Threads("T1");
        Threads thread2 = new Threads("T2");
        Threads thread3 = new Threads("T3");

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
