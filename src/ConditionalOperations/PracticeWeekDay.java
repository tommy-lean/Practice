package ConditionalOperations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of week day: (1,2,3,4,5,6,7)");
        int number = scanner.nextInt();


        String day;
        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else if (number == 7) {
            day = "Sunday";
        } else {
            day = "Uncorrected number of day: " + number + "," + " \n Please enter 1-7 ";
        }
        //
        System.out.println(day);


//                    КОНСТРУКЦИЯ КОДА С ТЕРНАРНЫМ ОПЕРАТОРОМ
//        var day = 1;
//        System.out.println(
//                day == 1 ? "Monday" :
//                        day == 2 ? "Tuesday" :
//                                day == 3 ? "Wednesday" :
//                                        day == 4 ? "Thursday" :
//                                                day == 5 ? "Friday" :
//                                                        day == 6 ? "Saturday" :
//                                                                day == 7 ? "Sunday" :
//                                                                        "Invalid day: " + day);
    }
}
