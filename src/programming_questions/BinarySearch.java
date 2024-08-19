package programming_questions;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int x = 5;

        int result = binarySearch(arr, 0, n - 1, x);
        System.out.printf("%d is at arr[%d]", x, result);
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                return binarySearch(arr, mid + 1, right, x);
            }
            return binarySearch(arr, 0, mid - 1, x);
        }

        return -1;
    }
}
