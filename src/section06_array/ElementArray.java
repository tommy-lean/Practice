package section06_array;

import java.util.Arrays;

public class ElementArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        // индексация в массивах начинается с нуля. то есть элемент "1" в масссиве имеет индекс 0; 2 - 1 индекс и тд
        // Чтобы вывести на консоль конкретный элемент массива, то делаем:
        System.out.println(array[0]);

        array[0] = 45;
        System.out.println(Arrays.toString(array));

        System.out.print(array[0] + " ");   // первый элемент массива выведется, то есть 45 после обновления
        System.out.print(array[1] + " ");  // 2
        System.out.print(array[2] + " ");  // 3
        System.out.print(array[3] + " ");  // 4
        System.out.print(array[4] + " ");  // 5
    }
}
