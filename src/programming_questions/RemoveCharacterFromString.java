package programming_questions;

public class RemoveCharacterFromString {

    public static void main(String[] args) {

        String str = "Australia";
        System.out.println("Before: " + str);

        str = str.toLowerCase().replace("a", "");
        System.out.println("After: " + str);
    }
}
