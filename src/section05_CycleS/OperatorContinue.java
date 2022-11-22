package section05_CycleS;

public class OperatorContinue {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if(i >= 3 && i <= 6){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // Говорится, что лучше не использовать оператор continue, стараться находить решение как снизу.
        // Но я сам думаю, что если не можешь найти решение без него, то можно его и оставить.
        // Вот аналог кода без continue:
        for (int i = 0; i < 10; i++) {
            if(i<3 || i>6){
                System.out.print(i + " ");
            }
        }
    }
}
