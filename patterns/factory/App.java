package patterns.factory;

public class App {
    
    public static void main(String[] args) {
        

        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);

        animal.eat();
    }
}
