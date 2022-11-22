package section05_CycleS;

public class NestedCycles {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i * 10 + j + 1) + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");
        // Это код программы для вывода чисел в таблицу от 0 до 99
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i * 10 + j) + "\t");
            }
            System.out.println();
        }
    }
}
