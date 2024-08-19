package programming_questions;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseIteration(number);
        System.out.printf("Reversed number: %d", reversedNumber);
    }

    public static int reverseIteration(int n) {

        int ans = 0;
        while (n != 0) {
            ans = ans * 10 + (n % 10);
            n = n / 10;
        }

        return ans;
    }

    public static int reverseRecursion(int n, int ans) {

        if (n == 0) {
            return ans;
        }

        ans = ans * 10 + (n % 10);
        return reverseRecursion(n / 10, ans);
    }
}
