package Task1;

public class Threads extends Thread {

    String name;

    public Threads(String name) {

        this.name = name;

    }

    @Override
    public void run() {

        for (int i = 1; i <= 1; i++) {
            System.out.println("Имя потока " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
