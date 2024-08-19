package programming_questions.sorting_algorithms;

/**
 * Worst case time complexity -> O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 6, 4, 9, 12};
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            //Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
