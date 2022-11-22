package section07_String;

public class PracBigIntegerSum {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String a = "123456789012345678901234567890123456789012345678901234567890";
        String b = "12345678901234567890123456789012345678901234567890";

        String a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        String b1 = b.length() >= a.length() ? b : "0".repeat(a.length() - b.length()) + b;
        int reserve = 0;

        for (int i = a1.length() - 1; i >= 0; i--) {
            int el1 = Character.getNumericValue(a1.charAt(i));
            int el2 = Character.getNumericValue(b1.charAt(i));
            int sum = el1 + reserve + el2;
            if(sum >= 10){
                sum = sum%10;
                reserve = 1;
            }
            else{
                reserve = 0;
            }
            result.insert(0, sum);

        }

        if(reserve == 1){
            result.insert(0, reserve);
        }

        System.out.println(result.toString());
        }
    }
