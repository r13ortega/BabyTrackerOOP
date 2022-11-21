import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Baby implements java.io.Serializable{

    ArrayList<LifeEvent> baby;

    public Baby() {
        this.baby = new ArrayList<>();
    }

    public void lifeEventCreate() {
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
        int answer = 0;
        do {
            System.out.println("Please select a baby event?\n" +
                    "(1) Diaper\n" +
                    "(2) Feeding\n" +
                    "(3) Sleep\n" +
                    "Please Enter in the Number of the Event");
            answer = Integer.parseInt(scan.nextLine());
            if (answer == 1 || answer == 2 || answer == 3){
                break;
            } else {
                System.out.println("Invalid entry, please try again.\n" +
                        "\n");
            }
        }while(true);
        if (answer ==1) {
            event += diaper();
        } else if (answer == 2) {
            event += feeding();
        } else if (answer == 3) {
            event += sleep();
        } else {
            System.out.println("naw lets try it again");
        }
        LifeEvent life = new LifeEvent(date, time, event);
        baby.add(life);
    }

    public String diaper() {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("What kind of accident did the baby have?\n" +
                    "1. Wet \n" +
                    "2. Dirty \n" +
                    "3. Mix ");
            answer =Integer.parseInt(scan.nextLine());
            if (answer == 1 || answer == 2 || answer ==3){
                break;
            } else {
                System.out.println("Invalid entry, please enter in 1,2, or 3\n");
            }
        }while (true);
        switch (answer) {
            case 1:
                return "Wet Diaper";
            case 2:
                return "Dirty Diaper";
            case 3:
                return "Mix Diaper";
        }
        return null;
    }

    public String feeding() {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("What did the baby eat?\n" +
                    "1. Formula \n" +
                    "2. Breast Milk \n" +
                    "3. Food Food ");
            answer =Integer.parseInt(scan.nextLine());
            if (answer == 1 || answer == 2 || answer ==3){
                break;
            } else {
                System.out.println("Invalid entry, please enter in 1,2, or 3\n");
            }
        }while (true);
        String feed = "";
        switch (answer) {
            case 1:
                feed += "Formula ";
                break;
            case 2:
                feed += "Breast Milk ";
                break;
            case 3:
                feed += "Food ";
                break;
        }
        System.out.println("How many oz did the baby eat/drink?");
        feed += scan.nextLine() + " oz";
        return feed;
    }

    public String sleep() {
        System.out.println("When did the baby fall asleep?" +
                "\n Please write as hh:mm a\n" +
                "example 12:37 AM or 2:56 PM");
        Scanner scan = new Scanner(System.in);
        String sleep = "Bake woke up. Baby fell asleep at ";
        sleep += scan.nextLine();
        return sleep;
    }


    public void printingEvents() {
        for (LifeEvent life : this.baby) {
            //calling the Printer method from LifeEvent Classes/instance
            life.printer();
        }
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e) {
            System.out.println("How did you mess that up?");
        }
    }

    public void removeEvents() {
        for (int i = 0; i < baby.size(); i++) {
                System.out.println(i+1 + ": " + baby.get(i).date + " " + baby.get(i).time + " " + baby.get(i).event);
        }
        System.out.println("Which event would you like to remove?\n" +
                "Please enter the number of the event you wish to remove");
        Scanner scan = new Scanner(System.in);
        int answer = Integer.parseInt(scan.nextLine());
        answer -=1;
        baby.remove(answer);
    }

    public void updateEvent() {
        int answer = 99;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("What Baby Event are you trying to modify?\n" +
                    "Enter (1) for Diaper\n" +
                    "Enter (2) for Feeding\n" +
                    "Enter (3) for Sleep\n" +
                    "or Enter (0) to exit update");
            answer =Integer.parseInt(scan.nextLine());
            if (answer == 1 || answer == 2 || answer ==3 ||answer ==0){
                break;
            } else {
                System.out.println("Invalid entry, please enter in 1,2, or 3\n");
            }
        }while (true);
        switch (answer) {
            case 1:
                updateDiaper();
                break;
            case 2:
                updateFeeding();
                break;
            case 3:
                updateSleeping();
                break;
            case 0:
                break;
        }
    }

    public void updateDiaper() {
        for (int i = 0; i < baby.size(); i++) {
            if (baby.get(i).event.contains("Diaper")) {
                System.out.println(i +1 + ": " + baby.get(i).time + " " + baby.get(i).event);
            }
        }
        System.out.println("Please enter in the number of the Diaper Event you wish to Update");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        num = num - 1;
        /////////////////////////////////
        int answer = 99;
        do {
            System.out.println("Would you like to update the date, time, event, or all?\n" +
                    "Type (1) for Date\n" +
                    "Type (2) for Time\n" +
                    "Type (3) for Event\n" +
                    "Type (4) for All");
            answer = Integer.parseInt(scan.nextLine());
            if (answer == 1 || answer == 2 || answer == 3 || answer == 4) {
                break;
            } else {
                System.out.println("Invalid entry, please enter in 1,2, or 3\n");
            }
        }while (true);
        ////////////////////////////////


        switch (answer) {
            case 1:
                System.out.println("When date did the baby fall asleep?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                break;
            case 2:
                System.out.println("When did the baby fall asleep?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                break;
            case 3:
                System.out.println("What kind of accident did the baby have?\n" +
                        "Type (1) for Wet \n" +
                        "Type (2) for Dirty \n" +
                        "Type (3) for Mix");
                int answer1 = scan.nextInt();
                scan.nextLine();
                switch (answer1) {
                    case 1:
                        baby.get(num).event = "Wet Diaper";
                        break;
                    case 2:
                        baby.get(num).event = "Dirty Diaper";
                        break;
                    case 3:
                        baby.get(num).event = "Mix Diaper";
                        break;
                }
                break;
            case 4:
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
                int ans = scan.nextInt();
                scan.nextLine();
                switch (ans) {
                    case 1:
                        baby.get(num).event = "Wet Diaper";
                        break;
                    case 2:
                        baby.get(num).event = "Dirty Diaper";
                        break;
                    case 3:
                        baby.get(num).event = "Mix Diaper";
                        break;
                }
        }
    }

    public void updateFeeding(){

        for (int i = 0; i < baby.size(); i++) {
            if (baby.get(i).event.contains("oz")) {
                System.out.println((i+1) +": " + baby.get(i).time + " " + baby.get(i).event);
            }
        }
        System.out.println("Please enter in the number of the Feeding Event you wish to Update");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        num = num - 1;
        System.out.println("Would you like to update the date, time, event, or all?\n" +
                "Type (1) for Date\n" +
                "Type (2) for Time\n" +
                "Type (3) for Event\n" +
                "Type (4) for All");
        int update = Integer.parseInt(scan.nextLine());
        switch (update){
            case 1:
                System.out.println("When date did the baby eat?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                break;
            case 2:
                System.out.println("When did the baby eat?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                break;
            case 3:
                System.out.println("What did the baby eat?\n" +
                        "1. Formula \n" +
                        "2. Breast Milk \n" +
                        "3. Food Food ");
                int answer = scan.nextInt();
                scan.nextLine();
                String feed = "";
                switch (answer) {
                    case 1:
                        feed += "Formula ";
                        break;
                    case 2:
                        feed += "Breast Milk ";
                        break;
                    case 3:
                        feed += "Food ";
                        break;
                }
                baby.get(num).event = feed;
                System.out.println("How many oz did the baby eat/drink?");
                baby.get(num).event += scan.nextLine() + " oz";
                break;
            case 4 :
                System.out.println("When date did the baby eat?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                System.out.println("When did the baby eat?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                System.out.println("What did the baby eat?\n" +
                        "1. Formula \n" +
                        "2. Breast Milk \n" +
                        "3. Food Food ");
                int ans = scan.nextInt();
                scan.nextLine();
                String fee = "";
                switch (ans) {
                    case 1:
                        fee += "Formula ";
                        break;
                    case 2:
                        fee += "Breast Milk ";
                        break;
                    case 3:
                        fee += "Food ";
                        break;
                }
                baby.get(num).event = fee;
                System.out.println("How many oz did the baby eat/drink?");
                baby.get(num).event += scan.nextLine() + " oz";
                break;
        }
    }

    public void updateSleeping(){
        for (int i = 0; i < baby.size(); i++) {
            if (baby.get(i).event.contains("woke")) {
                System.out.println((i+1) +": " + baby.get(i).time + " " + baby.get(i).event);
            }
        }
        System.out.println("Please enter in the number of the Sleeping Event you wish to Update");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        num = num - 1;
        System.out.println("Would you like to update the date, time, event, or all?\n" +
                "Type (1) for Date\n" +
                "Type (2) for Time\n" +
                "Type (3) for Event\n" +
                "Type (4) for All");
        int update = Integer.parseInt(scan.nextLine());
        switch (update){
            case 1:
                System.out.println("What date did the baby wake up?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                break;
            case 2:
                System.out.println("What time did the baby wake up?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                break;
            case 3:
                System.out.println("When did the baby fall asleep?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                String sleep = "Bake woke up. Baby fell asleep at ";
                sleep += scan.nextLine();
                baby.get(num).event = sleep;
            case 4 :
                System.out.println("What date did the baby wake up?" +
                        "\n Please write as MM/dd/yyyy\n" +
                        "example 09/18/2022 AM or 11/18/2021");
                baby.get(num).date = scan.nextLine();
                System.out.println("What time did the baby wake up?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                baby.get(num).time = scan.nextLine();
                System.out.println("When did the baby fall asleep?" +
                        "\n Please write as hh:mm a\n" +
                        "example 12:37 AM or 2:56 PM");
                String sle = "Bake woke up. Baby fell asleep at ";
                sle += scan.nextLine();
                baby.get(num).event = sle;
                break;
        }
    }

    public void serialization(){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:/Users/r1ort/IdeaProjects/BabyTrackerOOP/src/main/java/BabyTracker.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.baby);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /main/java/BabyTracker.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void deserializing(){
        try {
            FileInputStream fileIn = new FileInputStream("C:/Users/r1ort/IdeaProjects/BabyTrackerOOP/src/main/java/BabyTracker.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.baby = (ArrayList<LifeEvent>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("BabyTracker.ser not found, unable to load previous data");
            c.printStackTrace();
        }
    }
}

