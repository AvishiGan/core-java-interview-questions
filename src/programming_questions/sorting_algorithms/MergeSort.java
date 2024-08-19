package programming_questions.sorting_algorithms;

/**
 * Worst case time complexity -> O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {

    }

    public static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int mid = l + (r - l) / 2;

            mergeSort(arr, 0, mid - 1);
            mergeSort(arr, mid + 1, r);
            //TODO:Define merge function
            //merge(arr, l, m, r);
        }
    }
}
