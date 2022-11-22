package section06_array;

public class ArrayFor {
    public static void main(String[] args){
        int[] array = {1, 3, 6, 7, 9, 5};
        // Данный цикл позволяет пройтись по всем элементам массива и вывести их на консоль
        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // С помощью шаблона "array.fori" можно создать быстро конструкцию снизу
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // данная конструкция перебирает массив в обратном порядке, шаблон array.forr
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Arrayfor");
        // Данная конструкция то же самое, что и первая, эту предлагает Идеа, да и сама конструкция короче, шаблон array.for
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
