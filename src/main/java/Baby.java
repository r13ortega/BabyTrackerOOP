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
        String event = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select a baby event?\n" +
                "(1) Diaper\n" +
                "(2) Feeding\n" +
                "(3) Sleep\n" +
                "Please Enter in the Number of the Event");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("1")){
            event +=diaper();
        } else if (answer.equalsIgnoreCase("2")) {
            event +=feeding();
        } else if (answer.equalsIgnoreCase("3")) {
            event +=sleep();
        } else {
            System.out.println("naw lets try it again");
        }
        LifeEvent life = new LifeEvent(date, time, event);
        baby.add(life);
    }

    public String diaper(){
        System.out.println("What kind of accident did the baby have?\n" +
                "1. Wet \n" +
                "2. Dirty \n" +
                "3. Mix ");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        scan.nextLine();
            switch (answer){
                case 1 : return "Wet Diaper";
                case 2 : return "Dirty Diaper";
                case 3 : return "Mix Diaper";
            }
        return null;
    }
    public String feeding(){
        System.out.println("What did the baby eat?\n" +
                "1. Formula \n" +
                "2. Breast Milk \n" +
                "3. Food Food ");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        scan.nextLine();
        String feed = "";
            switch (answer){
                case 1 : feed += "Formula ";
                case 2 : feed += "Breast Milk ";
                case 3 : feed += "Food ";
        }
        System.out.println("How many oz did the baby eat/drink?");
        feed += scan.nextLine();
        return feed;
    }

    public String sleep(){
        System.out.println("When did the baby fall asleep?" +
                "\n Please write as hh:mm a\n" +
                "example 12:37 AM or 2:56 PM");
        Scanner scan = new Scanner(System.in);
        String sleep = "Bake woke up. Baby fell asleep at ";
        sleep += scan.nextLine();
        return sleep;
    }



    public void printingEvents(){
        for (LifeEvent life: this.baby) {
            //calling the Printer method from LifeEvent Classes/instance
            life.printer();
        }
    }

    public void removeEvents(){


    }

    public void updateEvent (){
        System.out.println("What Baby Event are you trying to modify?\n" +
                "Enter (1) for Diaper\n" +
                "Enter (2) for Feeding\n" +
                "Enter (3) for Sleep");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("1")){
            
        } else if (answer.equalsIgnoreCase("2")) {
            
        } else if (answer.equalsIgnoreCase("3")) {
            
        }
    }
}
