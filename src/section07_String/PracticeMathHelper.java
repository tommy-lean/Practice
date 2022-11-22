package section07_String;

import java.util.Scanner;

public class PracticeMathHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
        System.out.println("Enter cmd: pi, e, exit or quit");
        String cmd = scanner.nextLine();
            if (cmd.equals("exit") || cmd.equals("quit")) {
                System.out.println("Exit program");
                break;
            } else if (cmd.equals("pi")) {
                System.out.println("PI = 3.141592653589793");
            } else if (cmd.equals("e")) {
                System.out.println("e = 2.718281828459045");
            } else {
                System.out.println("Invalid cmd.");
            }
        }


    }
}
