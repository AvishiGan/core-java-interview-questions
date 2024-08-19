package programming_questions;

public class PowerCalculator {

    public static void main(String[] args) {

        int n = 2;
        int a = 4;
        System.out.printf("%d power %d = %d", n, a, powerRecursion(n, a));
    }

    //powerRecursion(2, 3) returns 2 * powerRecursion(2, 2)
    //powerRecursion(2, 2) returns 2 * powerRecursion(2, 1)
    //powerRecursion(2, 1) returns 2 * powerRecursion(2, 0)
    //powerRecursion(2, 0) returns 1 (because the exponent is 0)
    //Final result = 2 * 2 * 2 * 1 = 8
    public static int powerRecursion(int n, int a) {
        if (a == 0) {
            return 1;
        }

        return powerRecursion(n, a - 1) * n;
    }
}
