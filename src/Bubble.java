public class Bubble {
    public static void main(String[] args) {
        int[] sortArray = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int size = sortArray.length;
        int t;
        System.out.println("Несортированный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(sortArray[i]+"\t");
        }
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--)
                if (sortArray[j - 1] > sortArray[j]) {
                    t = sortArray[j-1];
                    sortArray[j - 1] = sortArray[j];
                    sortArray[j] = t;

                }
        }
        System.out.println("\nГотовый отсортированный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(sortArray[i]+"\t");
        }
    }
}
