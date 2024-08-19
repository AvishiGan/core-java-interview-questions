package programming_questions;

public class SumOfNumbersInString {

    public static void main(String[] args) {

        String s = "1234567890";
        int ans = 0;

        //When you have a char that’s a digit (like '0', '1', '2', etc.),
        //it’s actually stored as a Unicode value.
        //The Unicode values for the characters '0' to '9' are 48 to 57, respectively.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                ans = ans + (c - '0'); //Subtract '0' to get the numeric value of the digit character
            }
        }

        System.out.println(ans);
    }
}
