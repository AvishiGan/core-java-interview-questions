package programming_questions;

public class SumArrayElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }
}
