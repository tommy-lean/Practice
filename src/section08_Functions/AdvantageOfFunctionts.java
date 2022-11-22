package section08_Functions;

public class AdvantageOfFunctionts {
    public static void main(String[] args) {
        // read source data
        int array1[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        displayResult(array1, calculateStatistics(array1));

        System.out.println("------------------");

        // Мы создали новый массив, и с помощью функции, не переписывая весь код, мы вычисляем статистику элементов
        // по другому массиву, просто обращаясь к функции в которую как раз внесен код по вычислению статистики
        int array2[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2, 6, 7, 4, 5, 2};
        displayResult(array2, calculateStatistics(array2));
    }

    private static void displayResult(int[] array, int[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " = " + ((double) result[i][1] / array.length * 100) + " %");
        }
    }

    private static int[][] calculateStatistics(int[] array) {
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            if (!isAlreadyProcessed(array, unique, index, i)) {
                int number = calculateElementCount(array, i, element);
                index = addToResult(unique, counts, index, element, number);
            }
        }
        return convertResults(unique, counts, index);
    }

    private static boolean isAlreadyProcessed(int[] array, int[] unique, int index, int i) {
        boolean exists = false;
        for (int j = 0; j < index; j++) {
            if (unique[j] == array[i]) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    private static int calculateElementCount(int[] array, int i, int element) {
        int number = 1;
        for (int j = i + 1; j < array.length; j++) {
            if (element == array[j]) {
                number++;
            }
        }
        return number;
    }

    private static int addToResult(int[] unique, int[] counts, int index, int element, int number) {
        unique[index] = element;
        counts[index] = number;
        index++;
        return index;
    }

    private static int[][] convertResults(int[] unique, int[] counts, int index) {
        int[][] result = new int[index][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        return result;
    }
}

