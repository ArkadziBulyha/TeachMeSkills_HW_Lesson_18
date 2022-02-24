package Task2;

public class MorningImitation extends Thread {


    public MorningImitation() {
    }

    public MorningImitation(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {

        for (int i = 1; i < 4; i++) {
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
