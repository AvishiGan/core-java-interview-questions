package programming_questions;

public class VowelConsonantCounter {

    public static void main(String[] args) {

        String str = "hello world!";
        int vowels = 0;
        int constants = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char search = str.charAt(i);

            if (search == 'a' || search == 'e' || search == 'i' || search == 'o' || search == 'u') {
                vowels++;
            } else if ((search >= 'a' && search <= 'z') || (search >= 'A' && search <= 'Z')) {
                constants++;
            }
        }

        System.out.println("Length:" + length);
        System.out.println("Vowels:" + vowels);
        System.out.println("Constants:" + constants);
    }
}
