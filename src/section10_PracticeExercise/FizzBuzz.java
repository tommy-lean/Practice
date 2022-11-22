package section10_PracticeExercise;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        // Тернарный оператор:
        for (int i = 1; i <= 100; i++) {
            System.out.println(i%3 == 0 && i%5 == 0 ? "FizzBuzz" : i%3 == 0 ? "Fizz" : i%5 == 0? "Buzz" : i);
        }
    }
}
