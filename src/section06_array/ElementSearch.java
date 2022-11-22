package section06_array;

public class ElementSearch {
    public static void main(String[] args) {
        int[] array = {4, 6, 9, 2, 3, 1, 5, 9, 3, 1};
        int query = 2;

        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == query){
                index = i;
                break;
            }

        }
        System.out.println(index);
    }
}
