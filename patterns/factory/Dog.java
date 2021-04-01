package patterns.factory;

public class Dog implements Animal {

    @Override
    public void eat() {
       System.out.println(Dog.class.getName()+" is eating");
        
    }
    
}
