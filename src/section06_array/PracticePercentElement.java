package section06_array;

public class PracticePercentElement {
    public static void main(String[] args){
        int array[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int unique[] = new int[array.length];
        int counts[] = new int[array.length];
        int count = 0;

        for(int i = 0; i < array.length; i++){
            int element = array[i];

            boolean exists = false;
            for(int j = 0; j < count; j++){
                if(unique[j] == element){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                var number = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if(element == array[j]){
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + " = " + ((double) counts[i]/ array.length*100) + " %");
        }
    }
}
