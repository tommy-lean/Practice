package section07_String;

public class PracBuilderReverse {
    public static void main(String[] args){
        String s = "Hello world!";

        StringBuilder builder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        String result = builder.toString();

        System.out.println(result);
        // insert
//        for (int i = 0; i < s.length(); i++) {
//            builder.insert(i, s.charAt(s.length()-i-1));
//        }
        // builder.append(s).reverse();




    }
}
