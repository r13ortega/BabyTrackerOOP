import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

//    @Test
////    void diaper(){
////        assertEquals(0, Baby.diaper());
////    }

}