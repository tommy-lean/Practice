package section07_String;

public class PracticeReverseString {
    public static void main(String[] args) {
        String s = "Hello world!";

        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(s.length()-1-i));
        }
        System.out.println();
        // тут вариант из ролика
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
