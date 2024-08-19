package programming_questions;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        System.out.println("Number1: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Number2: ");
        int n2 = scanner.nextInt();
        scanner.close();

        int result1 = gcdEuclidean(n1, n2);
        System.out.println(result1);
        int result2 = gcdIteration(n1, n2);
        System.out.println(result2);
    }

    //Euclidean algorithm to find the GCD
    //The recursive function is called until n2 is 0.
    //In the end, the value of n1 is the GCD or HCF of the given two numbers.
    public static int gcdEuclidean(int a, int b) {

        if (b != 0) {
            return gcdEuclidean(b, a % b);
        } else {
            return a;
        }
    }

    public static int gcdIteration(int a, int b) {

        int result = (Math.min(a, b));
        while (result > 0) {
            if (a % result == 0 || b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
}
