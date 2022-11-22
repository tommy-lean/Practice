package section09_recurcion;

public class PracLinearSearch {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 4, 5};
        int query = 4;
        System.out.println(linearSearchElement(array, 0, 0, query));

    }
    private static int linearSearchElement(int[] array, int result, int count, int query){
        if(count > array.length - 1){
            return -1;
        }
        else{
            if(query == count){
                result = array[count];
            }
            return linearSearchElement(array, result, count + 1, query);

        }
    }
}
//        int[] array = {1, 2, 3, 4, 5};
//        int query = 3;
//        int result = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if(i == query){
//                result = array[i];
//            }
//        }
//        System.out.println(result);
