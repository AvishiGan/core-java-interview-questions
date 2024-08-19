package programming_questions;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int N = 110001100;

        int a = 1;
        int ans = 0;

        while (N != 0) {
            ans = ans + (N % 10) * a;
            N = N / 10;
            a = a * 2;
        }

        System.out.println(ans);
    }
}
