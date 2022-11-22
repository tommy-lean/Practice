package section09_recurcion;

public class PracMinElement {
    public static void main(String[] args){
        int[] array = {11, 32, 9, 43, 7, 45, 6, 5, 22, 4, 10};
        System.out.println(minElement(array, 0, array[0]));
    }
    private static int minElement(int[] array, int count, int minEl ){
        if(count > array.length - 1){
            return minEl;
        }
        else{
            if(array[count] < minEl){
                minEl = array[count];
            }
            return minElement(array, count + 1, minEl);
        }
    }
}
//        int[] array = {1, 2, 3, 4, 5};
//        int minElement = array[0];
//
//
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] < minElement){
//                minElement = array[i];
//            }
//        }
//
//        System.out.println(minElement);
//    }
