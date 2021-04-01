package patterns.factory;

public class Lion implements Animal {

    @Override
    public void eat() {
       System.out.println(Lion.class.getName()+" is eating");
        
    }
    
}
