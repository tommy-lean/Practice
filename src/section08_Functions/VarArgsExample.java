package section08_Functions;

public class VarArgsExample {
    public static void main(String[] args){
        System.out.println(concat(""));
        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "World"));
        System.out.println(concat("Hello", " ", "World", "!"));
    }
    // private static String concat(String[] args) - пользователь как бы получает массив аргументов
    private static String concat(String... args){
        StringBuilder builder = new StringBuilder();
        for(String arg : args){
            builder.append(arg);
        }
        return builder.toString();
    }
}
