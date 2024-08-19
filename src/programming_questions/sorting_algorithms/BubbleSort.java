package programming_questions.sorting_algorithms;

/**
 * Worst case time complexity -> O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 6, 4, 9, 12};
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
