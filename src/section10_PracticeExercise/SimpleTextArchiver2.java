package section10_PracticeExercise;

import java.util.Arrays;

public class SimpleTextArchiver2 {
    public static void main(String[] args) {
        String source = "A".repeat(11) + "B".repeat(3) + "C".repeat(5);
        System.out.println("Source text: " + source);

        String zipped = zip(source);
        System.out.println("Zipped text: " + zipped);

        String unzipped = unzip(zipped);
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prev = source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            char current = source.charAt(i);
            if (prev == current) {
                count++;
            } else {
                result.append(prev).append(count);
                count = 1;
                prev = current;
            }
        }
        result.append(prev).append(count);
        return result.toString();
    }
    private static String unzip(String zipped){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < zipped.length(); i+=2) {
            int count = Character.getNumericValue(zipped.charAt(i));
            for (int j = 0; j < count; j++) {
                result.append(zipped.charAt(i-1));
            }
        }
        return result.toString();
    }


}
//    public static void main(String[] args) {
//        String source = "A".repeat(11) + "B".repeat(20) + "C".repeat(13);
//
//        String zipped = zip(source);
//
//        System.out.println("Zipped: " + zipped);
//
//        int[] counts = counts(zipped);
//
//        String unzipped = unzip(zipped, counts);
//        System.out.println("Unzipped: " + unzipped);
//
//        System.out.println(Arrays.toString(counts(zipped)));
//    }
//    private static String zip(String source){
//        StringBuilder result = new StringBuilder();
//        char prev = source.charAt(0);
//        int count = 1;
//        for (int i = 1; i < source.length(); i++) {
//            char ch = source.charAt(i);
//            if(ch == prev){
//                count++;
//            }
//            else {
//                result.append(prev).append(count);
//                count = 1;
//                prev = ch;
//
//            }
//        }
//        result.append(prev).append(count);
//        return result.toString();
//    }
//    private static String unzip(String zipped, int[] counts){
//        StringBuilder result = new StringBuilder();
//        StringBuilder builder = new StringBuilder();
//        int count = 0;
//        for (int i = 0; i < zipped.length(); i++) {
//            char current = zipped.charAt(i);
//            if (!Character.isDigit(current)) {
//                for (int j = 0; j < counts[count]; j++) {
//                    result.append(current);
//                }
//                count++;
//            }
//        }
//
//        return result.toString();
//    }
//    private static int[] counts(String zipped){
//        StringBuilder result = new StringBuilder();
//        int[] array = new int[zipped.length()/2+1];
//        int count = 0;
//        for (int i = 0; i < zipped.length(); i++) {
//            char current = zipped.charAt(i);
//
//            if(Character.isDigit(current)){
//                result.append(current);
//            }
//            else if(result.length() > 0){
//                int number = Integer.parseInt(result.toString());
//                array[count++] = number;
//                result.setLength(0);
//            }
//        }
//        if(result.length() > 0){
//            array[count] = Integer.parseInt(result.toString());
//        }
//        return array;
//    }
//}


