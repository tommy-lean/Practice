package section10_PracticeExercise;

public class SimpleTextArchiver4 {
    public static String digits = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*\\/()_+=-?<>`[]{}\\\"'\\\\|.,";

    public static void main(String[] args) {
        String source = "A".repeat(3) + "1".repeat(95) + "C".repeat(43);

        System.out.println("Source:   " + source);

        String zipped = zip(source);
        System.out.println("Zipped: " + zipped);

        String unzipped = unzip(zipped);
        System.out.println("Unzipped: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        char prev = source.charAt(0);
        int count = 1;
        char countChar = 0;
        for (int i = 1; i < source.length(); i++) {
            char ch = source.charAt(i);
            if (ch == prev) {
                count++;
            } else {
                zipChar(result, prev, count, countChar);
                count = 1;
                prev = ch;
            }
        }
        zipChar(result, prev, count, countChar);
        return result.toString();
    }

    private static void zipChar(StringBuilder result, char prev, int count, char countChar) {
        int quotient = count / digits.length();
        int remainder = count % digits.length();
        for (int i = 0; i < quotient; i++) {
            result.append(prev).append(digits.charAt(digits.length() - 1));
        }
        if (remainder != 0) {
            result.append(prev).append(digits.charAt(remainder - 1));
        }
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < zipped.length(); i += 2) {
            char ch = zipped.charAt(i);
            for (int j = 0; j < digits.length(); j++) {
                if (zipped.charAt(i + 1) == digits.charAt(j)) {
                    count = j + 1;
                    for (int k = 0; k < count; k++) {
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }
    // ВАРИАНТ С МЕТОДОМ INDEX OF
//    private static String unzip(String zipped) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < zipped.length(); i += 2) {
//            var ch = zipped.charAt(i);
//            int count = digits.indexOf(zipped.charAt(i + 1)) + 1;
//            for (int j = 0; j < count; j++) {
//                result.append(ch);
//            }
//        }
//        return result.toString();

}
