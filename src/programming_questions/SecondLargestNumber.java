package programming_questions;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        int[] array = {1, 2, 7, 6, 4, 9, 12};

        for (Integer i : array) {

            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }

        System.out.println(secondHighest);
    }
}
