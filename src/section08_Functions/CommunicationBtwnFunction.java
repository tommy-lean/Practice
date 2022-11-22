package section08_Functions;

public class CommunicationBtwnFunction {
    public static void main(String[] args) {
        int[] a = {9};
        function1(a);
        System.out.println(a[0]);
    }

    private static void function1(int[] a){
        a[0]++;
        System.out.println(a[0]);
    }

//    public static void main(String[] args) {           ИЗНАЧАЛЬНЫЙ КОД. ВЫВОД НА ЭКРАН БУДЕТ: 10 И 9
//        int a = 9;
//        function1(a);
//        System.out.println(a);
//    }
//
//    private static void function1(int a){
//        a++;
//        System.out.println(a);
//
//    }
}
