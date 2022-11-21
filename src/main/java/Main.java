import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Baby Lumina = new Baby();
        Scanner scan = new Scanner(System.in);

        System.out.println("\n" +
                "╭━━╮╱╱╱╭╮╱╱╱╱╱╱╭━━━━╮╱╱╱╱╱╱╭╮\n" +
                "┃╭╮┃╱╱╱┃┃╱╱╱╱╱╱┃╭╮╭╮┃╱╱╱╱╱╱┃┃\n" +
                "┃╰╯╰┳━━┫╰━┳╮╱╭╮╰╯┃┃┣┻┳━━┳━━┫┃╭┳━━┳━╮\n" +
                "┃╭━╮┃╭╮┃╭╮┃┃╱┃┃╱╱┃┃┃╭┫╭╮┃╭━┫╰╯┫┃━┫╭╯\n" +
                "┃╰━╯┃╭╮┃╰╯┃╰━╯┃╱╱┃┃┃┃┃╭╮┃╰━┫╭╮┫┃━┫┃\n" +
                "╰━━━┻╯╰┻━━┻━╮╭╯╱╱╰╯╰╯╰╯╰┻━━┻╯╰┻━━┻╯\n" +
                "╱╱╱╱╱╱╱╱╱╱╭━╯┃\n" +
                "╱╱╱╱╱╱╱╱╱╱╰━━╯\n");
        while (true){
        System.out.println("Please enter in the number of the option you want...\n" +
                "Type (1) to making an event(s)\n" +
                "Type (2) to see all event(s)\n" +
                "Type (3) to change an event(s)\n" +
                "Type (4) to remove an event(s)\n" +
                "Type (0) to Quit");
        int num1 = Integer.parseInt(scan.nextLine());
            if (num1 == 1){
                Lumina.lifeEventCreate();
            } else if (num1 == 2) {
                Lumina.printingEvents();
            } else if (num1 == 3) {
                Lumina.updateEvent();
            } else if (num1 == 4) {
                Lumina.removeEvents();
            } else if (num1 == 0) {
                break;
            }
        }
                
    }
}
