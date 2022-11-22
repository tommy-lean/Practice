package section05_CycleS;
import java.util.Scanner;

public class InfiniteCycleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            System.out.println(number * number);
        }
    }
}
