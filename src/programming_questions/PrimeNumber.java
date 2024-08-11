package programming_questions;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 10;
        boolean isPrime = true;

        if (number == 0 || number == 1) {
            isPrime = false;
        }

        if (number == 2) {
            isPrime = true;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime number", number);
        } else {
            System.out.printf("%d is not a prime number", number);
        }
    }
}
