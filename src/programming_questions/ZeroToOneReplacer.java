package programming_questions;

import static java.lang.Math.pow;

public class ZeroToOneReplacer {

    public static void main(String[] args) {

        int number = 101010001;
        int ans = 0;
        int i = 0;

        while (number != 0) {

            if (number % 10 == 0) {
                ans = (int) (ans + pow(10, i));
            } else {
                ans = (int) (ans + (number % 10) * pow(10, i));
            }

            number = number / 10;
            i++;
        }

        System.out.println(ans);
    }
}
