package section06_array;

public class WeekDay {
    public static void main(String[] args){
        int day = 10;

        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String result = day >= 1 && day <= 7 ? days[day-1] : "Invalid day:" + " \"" + day + "\"";


        System.out.println(result);
    }
}
