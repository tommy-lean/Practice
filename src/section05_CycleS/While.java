package section05_CycleS;

public class While {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        {
            int i = 0;
            for(; i < 5; ){
                System.out.print(i++ + " ");  // i ++ можно записать на следующей строке а вывести просто i
            }
            System.out.println();
        }

        int i = 0;
        while(i < 5){
            System.out.print("Element: " + i++ + " ");
        }
    }
}
