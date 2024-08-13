package programming_questions.design_patterns.creational;

public class Singleton {

    //static means it belongs to the Singleton class
    //not to any individual object of the class.
    private static Singleton instance;

    //private constructor
    //No other class can instantiate a Singleton object directly through the new keyword
    private Singleton() {
    }

    //Singleton class can only be instantiated once.
    //Any further attempts to create a new Singleton object will just return the existing instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
