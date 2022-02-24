package Task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Duties {

    private String name;
    private int priority;

    public Duties(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public Duties() {
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setProperties(String item) {

        Properties appProps = new Properties();

        try (FileInputStream fis = new FileInputStream("C:\\Users\\messo\\Desktop\\Lessons\\TeachMeSkills_HW_Lesson_18\\src\\Task2\\resources\\app.properties")) {
            appProps.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.name = appProps.getProperty("nameT" + item);
        this.priority = Integer.parseInt(appProps.getProperty("priorityT" + item));

    }
}