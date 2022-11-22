package section07_String;

public class BuilderVsStringConcatenation {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";

        String result1 = s1 + s2 + s3;
        String result2 = new StringBuilder().append(s1).append(s2).append(s3).toString();

        System.out.println(result1);
        System.out.println(result2);
    }
}
