package programming_questions;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 7, 6, 4, 9, 12};

        for (int i = 0; i < a.length / 2; i++) {

            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }

        for (int i = 0; i < a.length; i++) {

            System.out.print(" " + a[i]);
        }
    }
}
