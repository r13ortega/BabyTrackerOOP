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
                case 1 :
                    feed += "Formula ";
                    break;
                case 2 :
                    feed += "Breast Milk ";
                    break;
                case 3 :
                    feed += "Food ";
                    break;
        }
        System.out.println("How many oz did the baby eat/drink?");
        feed += scan.nextLine() + " oz";
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
        int answer = scan.nextInt();
        scan.nextLine();
        switch (answer){
            case 1 :
                updateDiaper();
                break;
            case 2 :

                break;
            case 3 :

                break;
        }
    }

    public void updateDiaper(){
        for (int i = 0; i < baby.size(); i++) {
            if(baby.get(i).event.contains("Diaper")){
                System.out.println("1: " + baby.get(i).time + " " + baby.get(i).event);
            }
        }
        System.out.println("Please enter in the number of the Diaper Event you wish to Update");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        num = num -1;
        System.out.println("Would you like to update the date, time, event, or all?\n" +
                "Type (1) for Date\n" +
                "Type (2) for Time\n" +
                "Type (3) for Event\n" +
                "Type (4) for All");
        int update = Integer.parseInt(scan.nextLine());
        switch (update){
            case 1 :
                System.out.println("When date did the baby fall asleep?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                break;
            case 2 :
                System.out.println("When did the baby fall asleep?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                break;
            case 3 :
                System.out.println("What kind of accident did the baby have?\n" +
                        "Type (1) for Wet \n" +
                        "Type (2) for Dirty \n" +
                        "Type (3) for Mix");
                int answer = scan.nextInt();
                scan.nextLine();
                switch (answer){
                    case 1 : baby.get(num).event = "Wet Diaper";
                    break;
                    case 2 : baby.get(num).event = "Dirty Diaper";
                    break;
                    case 3 : baby.get(num).event = "Mix Diaper";
                    break;
                }
                break;
            case 4 :
                System.out.println("When date did the baby fall asleep?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                System.out.println("When did the baby fall asleep?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                System.out.println("What kind of accident did the baby have?\n" +
                        "Type (1) for Wet \n" +
                        "Type (2) for Dirty \n" +
                        "Type (3) for Mix");
                int answer = scan.nextInt();
                scan.nextLine();
                switch (answer){
                    case 1 : baby.get(num).event = "Wet Diaper";
                        break;
                    case 2 : baby.get(num).event = "Dirty Diaper";
                        break;
                    case 3 : baby.get(num).event = "Mix Diaper";
                        break;
                break;
        }
    }
}
