package programming_questions.static_keyword.static_block;

public class Test {

    static int a = 10;
    static int b;

    //To do the computation in order to initialize the static variables
    //Gets executed exactly once
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {

        System.out.println("From main");
        System.out.println("Value of a: " + a);
        System.out.printf("Value of b: " + b);
    }
}
