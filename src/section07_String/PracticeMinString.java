package section07_String;

public class PracticeMinString {
    public static void main(String[] args) {
        String[] str = {"one", "two", "three", "four", "five"};

        String minStr = str[0];
        for (int i = 0; i < str.length; i++) {
            if(str[i].compareTo(minStr) < 0){
                minStr = str[i];
            }

        }

        System.out.println(minStr);
    }
}
