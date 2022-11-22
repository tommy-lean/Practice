package section07_String;

public class StringVsCharArray {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        // Тут можно изменить
        s1[0] = 'Q';
        for(int i = 0; i < s1.length; i++){
            System.out.print(s1[i]);
        }
        System.out.println();
        // -----------------------------------
        String s2 = "hello";
        // А тут нельзя изменить поэлементно строку
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i));
        }
        System.out.println();

    }
}
