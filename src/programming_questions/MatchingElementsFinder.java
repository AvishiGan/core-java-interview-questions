package programming_questions;

public class MatchingElementsFinder {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 1, 2, 6, 7};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    System.out.println(a[j]);
                }
            }
        }
    }
}
