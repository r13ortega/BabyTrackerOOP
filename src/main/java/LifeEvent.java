import java.util.ArrayList;

public class LifeEvent {
    String time;

    ArrayList<String> listOfEvents = new ArrayList<>();

    public LifeEvent(String time, ArrayList<String> listOfEvents) {
        this.time = time;
        this.listOfEvents = listOfEvents;
    }

    @Override
    public String toString() {
        return "LifeEvent{" +
                "time='" + time + '\'' +
                ", listOfEvents=" + listOfEvents +
                '}';
    }

}
