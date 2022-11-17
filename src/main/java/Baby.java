import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Baby {

    ArrayList<LifeEvent> baby;

    public Baby() {
        this.baby = new ArrayList<>();
    }
    public void lifeEventCreate(){
        //this records the time and date
        Date today = new Date();
        //when dateMate is called it will format "today" to mm/dd/yyyy ex. 11/17/2022
        SimpleDateFormat dateMate = new SimpleDateFormat("MM/dd/YYYY");
        //when timeMate is called it will format "today" to hh:mm a ex. 4:22 PM
        SimpleDateFormat timeMate = new SimpleDateFormat("hh:mm a");
        //the two strings below will use the formats above to get a String for today date and the time this was run
        String time = timeMate.format(today);
        String date = dateMate.format(today);


    }
    public static String diaper(){
        System.out.println("What kind of accident did the baby have?\n" +
                "1. Wet \n" +
                "2. Dirty \n" +
                "3. Mix ");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        scan.nextLine();
        while (answer != 1 || answer != 2 || answer != 3){
            switch (answer){
                case 1 : return "Wet";
                case 2 : return "Dirty";
                case 3 : return "Mix";
            }
        }
        return null;
    }


}
