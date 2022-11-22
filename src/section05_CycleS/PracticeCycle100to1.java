package section05_CycleS;

public class PracticeCycle100to1 {
    public static void main(String[] args){
//          read source data
        int from = 100;
        int to = 1;
        int step = 1;

//          processing
        String result;
        for(int i = from; i >= to; i -= step){
            result = i + " ";
            System.out.print(result);
        }
//          display results

        System.out.println("\nEnd");
    }
}
