package section07_String;

public class TransformationTypes {
    public static void main(String[] args) {
        int a = 1;
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello" + 1 + 1.1 + true + 'a');

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char sch1 = "a".charAt(0);
        char sch2 = "abc".charAt(2);
        System.out.println(sch2);
        //
        char ch = 2;
        int i = 4;
        double d = 8;
        int count = Character.getNumericValue(ch);

        d = i;
        d = ch;
        i = ch;

    }
}
