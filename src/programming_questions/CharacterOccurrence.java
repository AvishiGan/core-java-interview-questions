package programming_questions;

public class CharacterOccurrence {

    public static void main(String[] args) {

        String str = "hello world";
        int count = 0;
        int length = str.length();
        char search = 'l';

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == search) {
                count++;
            }
        }

        System.out.println(count);
    }
}
