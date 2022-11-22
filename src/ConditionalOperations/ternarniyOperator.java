package ConditionalOperations;

public class ternarniyOperator {
    public static void main(String[] args){
        int a = 4;

        if(a == 5){
            System.out.println("a == 5");
        }
        else{
            System.out.println("a != 5");
        }
        // Снизу сжатая конструкция блока кода if else. ":" - означает else
        // a == 5 ? - да. Тогда выполняется "a = 5", если нет, то : "a != 5"
        System.out.println(a == 5 ? "a = 5" : "a != 5");
    }
}
