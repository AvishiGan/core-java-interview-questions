package programming_questions;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "hello";
        String reverse = reverseString(str);

        if (str.equals(reverse)) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is not a palindrome", str);
        }
    }

    public static String reverseString(String str) {
        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }

        return reverse;
    }
}
