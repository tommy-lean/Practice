package ConditionalOperations;
import java.util.Scanner;

public class SwitchWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        int day = scanner.nextInt();
        System.out.println("Введите цифру \"1\", если вы приверженец Ислама. Иначе цифру \"2\"");
        int variant = scanner.nextInt();

//        Этот фрагмент кода моя доработка как в test.java Boolean использовать нельзя, поэтому я придумал вариант с
//      цифрами 1 2
        switch(variant){
            case 1:{
                day--;
                switch(day){
                    case 0:
                        day = 7;
                }

            }
            case 2:
                break;

        }
//        ----------------------------------
        String result;
        switch (day) {
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Incorrect number of day: " + day;


            }
        }
        System.out.println(result);





    }
}
