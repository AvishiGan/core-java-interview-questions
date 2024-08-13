package programming_questions.design_patterns.creational.factory;

public abstract class Animal {

    //makeSound -> the operation that the factory method
    //allows the subclasses (Dog and Cat) to alter
    public abstract void makeSound();
}
