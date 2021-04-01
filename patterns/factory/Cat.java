package patterns.factory;

public class Cat implements Animal {

    @Override
    public void eat() {
       System.out.println(Cat.class.getName()+" is eating");
        
    }
    
}
