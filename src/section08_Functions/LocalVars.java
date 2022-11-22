package section08_Functions;

public class LocalVars {
    public static void main(String[] args){
        int a = 2;
        function1();
        function2(a);
        System.out.println(a);
    }
    private static void function1(){
        int b = 2;
        System.out.println(b);


    }

    private static void function2(int a){
        //int a = 2;

    }

}
