package section08_Functions;

public class BlockExamples {
    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            System.out.println("Block B :"+a);
            System.out.println("Block B :"+b);
            {
                int c = 0;
                System.out.println("Block C :"+a);
                System.out.println("Block C :"+b);
                System.out.println("Block C :"+c);
            }
        }
        System.out.println("Block A :"+a);
    }
}
