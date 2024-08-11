package programming_questions;

public class Factorial {

    public static void main(String[] args) {

        int n = 4;
        System.out.printf("Factorial of %d: %d\n", n, factorialIteration(n));

        n = 5;
        System.out.printf("Factorial of %d: %d\n", n, factorialRecursion(n));
    }

    public static int factorialIteration(int n) {

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static int factorialRecursion(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }
}
