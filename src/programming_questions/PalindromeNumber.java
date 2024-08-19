package programming_questions;

public class PalindromeNumber {

    public static void main(String[] args) {

        int N = 1001;
        int reverse = reverseNumber(N);

        if (N == reverse) {
            System.out.printf("%d is a palindrome", N);
        } else {
            System.out.printf("%d is not a palindrome", N);
        }
    }

    public static int reverseNumber(int number) {
        int T = number;
        int ans = 0;

        while (T != 0) {
            ans = ans * 10 + (T % 10);
            T = T / 10;
        }

        return ans;
    }
}
