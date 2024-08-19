package programming_questions;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        System.out.println("Number1: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Number2: ");
        int n2 = scanner.nextInt();
        scanner.close();

        int result1 = gcdEuclidean(n1, n2);
        System.out.printf("GCD: %d\n", result1);
        int result2 = lcm(n1, n2);
        System.out.printf("LCM: %d", result2);
    }

    //Least Common Multiple.
    //It is the smallest positive integer that is divisible by both numbers.
    public static int lcm(int n1, int n2) {
        return Math.abs(n1 * n2) / gcdEuclidean(n1, n2);
    }

    public static int gcdEuclidean(int a, int b) {

        if (b != 0) {
            return gcdEuclidean(b, a % b);
        } else {
            return a;
        }
    }
}
