public class Bubble {
    public static void main(String[] args) {
        int[] sortArray = {5, 20, 1, 4, 8};
        int size = 5;
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
