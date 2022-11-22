package section05_CycleS;

public class Cycles {
    public static void main(String[] args){
//
//        System.out.println("Before for");
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//
//        }
//        System.out.println("After for");

//        -Программа зависнет и будет бесконечно выполняться, алгоритм выполнения программы:
//        Сначала у нас i = 0, i меньше или равно 5, верно, выполняется i--, получается -1, затем
//       выполняется i++, -1 + 1 равняется 0, потом снова 0 - 1 равняется -1 итак по кругу
//        Исправить можно только нажав стоп и исправить код
        for(int i = 0; i <= 5; i++){
            i--;
            System.out.println(i);
        }
        System.out.println("End");
    }
}
