package section07_String;
import java.util.Arrays;
public class StringIntro {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);
        System.out.println("hello");

        char[] array = {'h', 'e', 'l', 'l', 'o'};
        for (char res : array){
            System.out.print(res);
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
