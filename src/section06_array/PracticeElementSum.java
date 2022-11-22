package section06_array;

public class PracticeElementSum {
    public static void main(String[] args){
        int array[] = {2, 6, 8, 9, 2, 9};

        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res = res + array[i];
            System.out.print(array[i] + " + ");
        }
        System.out.println(" = " + res);

        System.out.println();

        // А тут снизу конструкция с циклом foreach, в value поочередно записываются все значения цикла
        int sum = 0;

        for(int value : array){
            sum = sum + value;
        }

        System.out.println(sum + " - foreach");


    }
}
