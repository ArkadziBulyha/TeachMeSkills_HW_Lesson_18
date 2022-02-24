package Task2;

public class runner {

    public static void main(String[] args) {

        Duties property = new Duties();

        property.setProperties("1");
        MorningImitation thread1 = new MorningImitation(property.getName(), property.getPriority());
        System.out.println(thread1);

        property.setProperties("2");
        MorningImitation thread2 = new MorningImitation(property.getName(), property.getPriority());
        System.out.println(thread2);

        property.setProperties("3");
        MorningImitation thread3 = new MorningImitation(property.getName(), property.getPriority());
        System.out.println(thread3);

    }
}
