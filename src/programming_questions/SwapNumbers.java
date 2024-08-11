package programming_questions;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 7;

        System.out.println("a before:" + a);
        System.out.println("b before:" + b);

        a = a + b;
        b = a - b; //(a + b) - b -> (a is swapped)
        a = a - b; //a - (a - b) -> (b is swapped)

        System.out.println("a after:" + a);
        System.out.println("b after:" + b);
    }
}
