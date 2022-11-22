package section08_Functions;

public class ItProggerFunctions {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 4, 6, 8};

        int result =  summaArray(array1);
        System.out.println("1 array : " + result);
        System.out.println("2 array: " + summaArray(array2));
    }

    private static int summaArray(int[] args) {
        int sum = 0;
        for (int arg : args){
            sum += arg;
        }
        return sum;
    }
}




//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");
//
//        int num = 7;
//        int result1 = summa((short) 5, (short) num);
//        int num2 = 8;
//        int result2 = summa((short) 5, (short) num2);
//        info(String.valueOf(result2));
//    }
//
//    public static int summa(short a, short b){
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        return res;
//
//    }
//
//    public static void info(String word){
//        System.out.print(word);
//        System.out.println("!");
//
//    }

