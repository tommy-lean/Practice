package section11_Decomposition;

import java.util.Arrays;
import java.util.Locale;

public class FindPopularWord {
    public static void main(String[] args) {
        String text = "hello java 3 3 3 3 3 3 3 java world java hello I Hello Java World java";

        // разбиваем слова строки в элементы массива
        String[] words = getStringsInsideArray(text);

        //toLowerCase

        // Добавляем в 1 массив уникальные элементы а во второй их повторения
        System.out.println(Arrays.toString(words));
        int[] counts = new int[words.length];
        String[] wordsUnique = new String[words.length];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            String element = words[i];

            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if(wordsUnique[j].equals(element)) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                int countsUnique =  1;
                for (int j = i+1; j < words.length; j++) {
                    if (element.equals(words[j])) {
                        countsUnique++;
                    }
                }

                counts[index] = countsUnique;
                wordsUnique[index] = element;
                index++;
            }
        }


        int maxCount = counts[0];
        String popularWord = wordsUnique[0];
        // Поиск из имеющихся массивов слова с самым большим повторением и его вывод
        for (int i = 1; i < index; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                popularWord = wordsUnique[i];
            }
        }


        System.out.println("Most popular word: \"" + popularWord + "\". His counts : " + maxCount);
    }

    private static String[] getStringsInsideArray(String text) {
        StringBuilder builder = new StringBuilder();
        String[] wordsTemp = new String[text.length()/2];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(Character.isLetter(ch) & !Character.isDigit(ch)){
                builder.append(ch);
            }
            else{
                if(builder.length() > 0) {
                    wordsTemp[count] = builder.toString();
                    count++;
                    builder.setLength(0);
                }
            }
        }
        if(builder.length() > 0) {
            wordsTemp[count] = builder.toString();
            count++;
            builder.setLength(0);
        }
        // Удаляем ненужные пустые элементы массива, создавая новый массив и копируя их туда
        String[] words = Arrays.copyOf(wordsTemp, count);
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        return words;
    }





    private static void ArrayWords(){

    }
}
