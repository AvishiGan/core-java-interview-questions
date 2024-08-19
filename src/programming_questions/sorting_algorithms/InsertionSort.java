package programming_questions.sorting_algorithms;

/**
 * Worst case time complexity -> O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] a = {1, 2, 7, 6, 4, 9, 12};
        int length = a.length;

        for (int i = 0; i < length - 1; i++) {

            for (int j = i + 1; j < length - 1 - i; j++) {

                if (a[i] > a[i + 1]) {

                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }

            System.out.print(" " + a[i]);
        }
    }
}
