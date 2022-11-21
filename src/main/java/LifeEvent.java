import java.util.ArrayList;

public class LifeEvent implements java.io.Serializable{

    String date;
    String time;

    String event;

    public LifeEvent(String date, String time, String event) {
        this.date = date;
        this.time = time;
        this.event = event;
    }

    public void printer() {
        System.out.println("Time: " + time + "\nDate: " + date + "\nEvent: " + event +"\n" +
                "-------------------------\n");
    }

}
