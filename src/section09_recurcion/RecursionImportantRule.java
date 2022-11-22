package section09_recurcion;

public class RecursionImportantRule {
    public static void main(String[] args) {
        function1(10);

    }

    private static void function1(int count) {
        if(count > 0){
            System.out.print(count + " ");
            function1(count-1);
        }
        System.out.println(count);
    }
}
