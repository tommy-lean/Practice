package section06_array;
import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array = {8,2,3,4,13};
        System.out.println(Arrays.toString(array));

        // снизу команда выводящая размер массива, т.е. количество элементов в нем
        System.out.println(array.length);
        // команда позволяющая выводить в консоль последний элемент массива
        System.out.println(array[array.length - 1]);
    }
}
