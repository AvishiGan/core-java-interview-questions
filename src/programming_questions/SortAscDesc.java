package programming_questions;

import java.util.Arrays;
import java.util.Collections;

public class SortAscDesc {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int N = arr.length;
        sortHalf(arr, N);

        System.out.println();

        sortHalf(arr1);
        System.out.print(Arrays.toString(arr1));
    }

    public static void sortHalf(Integer[] arr) {

        int n = arr.length;

        //Sort the first half in ascending order
        Arrays.sort(arr, 0, n / 2);

        //Sort the second half in descending order
        Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
    }

    public static void sortHalf(int[] arr, int n) {

        //Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.printf(" %d", arr[i]);
        }

        for (int j = n - 1; j >= n / 2; j--) {
            System.out.printf(" %d", arr[j]);
        }
    }
}
