import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BabyTest {

    @org.junit.jupiter.api.Test
    void lifeEventCreate() {
    }
    @Test
    void feedingFormula(){
//            System.out.println("What did the baby eat?\n" +
//                    "1. Formula \n" +
//                    "2. Breast Milk \n" +
//                    "3. Food Food ");
//            Scanner scan = new Scanner(System.in);
            int answer = 1;
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
            //System.out.println("How many oz did the baby eat/drink?");
            String oz = "8";
            feed += oz;
            assertEquals("Formula 8", feed);
        }
        @Test
        void feedingBreastMilk(){
//            System.out.println("What did the baby eat?\n" +
//                    "1. Formula \n" +
//                    "2. Breast Milk \n" +
//                    "3. Food Food ");
//            Scanner scan = new Scanner(System.in);
        int answer = 2;
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
        //System.out.println("How many oz did the baby eat/drink?");
        String oz = "8";
        feed += oz;
        assertEquals("Breast Milk 8", feed);
    }
    @Test
    void feedingFood(){
//            System.out.println("What did the baby eat?\n" +
//                    "1. Formula \n" +
//                    "2. Breast Milk \n" +
//                    "3. Food Food ");
//            Scanner scan = new Scanner(System.in);
        int answer = 3;
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
        //System.out.println("How many oz did the baby eat/drink?");
        String oz = "8";
        feed += oz + " oz";
        assertEquals("Food 8 oz", feed);
    }

    @Test
    String diaperTest(int answer){
//        System.out.println("What kind of accident did the baby have?\n" +
//                "1. Wet \n" +
//                "2. Dirty \n" +
//                "3. Mix ");
//        Scanner scan = new Scanner(System.in);
//        int answer = scan.nextInt();
//        scan.nextLine();
        switch (answer){
            case 1 : return "Wet Diaper";
            case 2 : return "Dirty Diaper";
            case 3 : return "Mix Diaper";
        }
        return null;
    }
    @Test
    void realDiaperTest1(){
        assertEquals("Wet Diaper", diaperTest(1));
    }

    @Test
    void realDiaperTest2(){
        assertEquals("Dirty Diaper", diaperTest(2));
    }
    @Test
    void realDiaperTest3(){
        assertEquals("Mix Diaper", diaperTest(3));
    }

    @Test
     void numLogicTestForUpdate(){
        int num = 10;
        num -= 1;
        assertEquals(9, num);
    }
    @Test
    void removeTest1(){
        LifeEvent diaper = new LifeEvent("09/18/1990", "12:58 PM", "Wet Diaper");
        LifeEvent poo = new LifeEvent("09/18/1990", "12:58 PM", "Poo Diaper");
        LifeEvent eat = new LifeEvent("09/18/1990", "12:58 PM", "Eating");
        LifeEvent sleep = new LifeEvent("09/18/1990", "12:58 PM", "Nappy Nappy");
        ArrayList<LifeEvent> baby = new ArrayList<>();
        baby.add(diaper);
        baby.add(poo);
        baby.add(eat);
        baby.add(sleep);
//        for (int i = 0; i < baby.size(); i++) {
//            System.out.println(i + ": " + baby.get(i).time + " " + baby.get(i).event);
//        }
        int answer = 1;
        baby.remove(answer);
        assertSame("Eating", baby.get(1).event);
    }
    @Test
    void removeTest2(){
        LifeEvent diaper = new LifeEvent("09/18/1990", "12:58 PM", "Wet Diaper");
        LifeEvent poo = new LifeEvent("09/18/1990", "12:58 PM", "Poo Diaper");
        LifeEvent eat = new LifeEvent("09/18/1990", "12:58 PM", "Eating");
        LifeEvent sleep = new LifeEvent("09/18/1990", "12:58 PM", "Nappy Nappy");
        ArrayList<LifeEvent> baby = new ArrayList<>();
        baby.add(diaper);
        baby.add(poo);
        baby.add(eat);
        baby.add(sleep);
        int answer = 1;
        baby.remove(answer);
        baby.remove(answer);
        assertSame("Nappy Nappy", baby.get(1).event);
    }
    @Test
    void updateLogicTest1(){
        int i = 5;
        assertNotEquals(6, i+1);
    }
    @Test
    void updateTest1(){
        LifeEvent diaper = new LifeEvent("09/18/1990", "12:58 PM", "Wet Diaper");
        LifeEvent poo = new LifeEvent("09/18/1990", "12:58 PM", "Poo Diaper");
        LifeEvent eat = new LifeEvent("09/18/1990", "12:58 PM", "Eating");
        LifeEvent sleep = new LifeEvent("09/18/1990", "12:58 PM", "Nappy Nappy");
        ArrayList<LifeEvent> baby = new ArrayList<>();
        baby.add(diaper);
        baby.add(poo);
        baby.add(eat);
        baby.add(sleep);
        int update = 1;
        switch (update) {
            case 1:
                String date = "09/18/1990";
                baby.get(update).date = date;
                assertSame("09/18/1990", baby.get(update).date);
                //break; removing breaks to run test in one go
            case 2:
                String time = "11:56 AM";
                baby.get(update).time = time;
                assertSame("11:56 AM", baby.get(update).time);
                //break;
            case 3:
                int answer = 1;
                switch (answer) {
                    case 1:
                        baby.get(update).event = "Wet Diaper";
                        assertSame("Wet Diaper", baby.get(update).event);
                        break;
                    case 2:
                        baby.get(update).event = "Dirty Diaper";
                        break;
                    case 3:
                        baby.get(update).event = "Mix Diaper";
                        break;
                }
                break;
            case 4:

                }
        assertSame("Wet Diaper", baby.get(update).event);

    }
    }