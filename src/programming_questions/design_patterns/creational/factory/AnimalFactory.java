package programming_questions.design_patterns.creational.factory;

//AnimalFactory -> factory class
public class AnimalFactory {

    //createAnimal -> factory method
    public Animal createAnimal(String type) {
        if ("Dog".equals(type)) {
            return new Dog();
        } else if ("Cat".equals(type)) {
            return new Cat();
        }
        return null;
    }
}
