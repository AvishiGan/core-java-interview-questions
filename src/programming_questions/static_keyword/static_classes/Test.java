package programming_questions.static_keyword.static_classes;

//A java program to demonstrate use
//of static keyword with Classes
public class Test {

    private static String str = "GeeksforGeeks";

    //Static class
    static class MyNestedClass {

        //non-static method
        public void disp() {
            System.out.println(str);
        }
    }

    public static void main(String args[]) {
        Test.MyNestedClass obj
                = new Test.MyNestedClass();
        obj.disp();
    }
}

