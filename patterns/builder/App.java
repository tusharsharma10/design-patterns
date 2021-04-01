package patterns.builder;

public class App {
    
    public static void main(String[] args) {
        
        Person person1 =  new Person.Builder("Thomas","tomasso@gmail.com").setAddress("Jose Molina Street").build();

        Person person2 =  new Person.Builder("Jesse","jesse@gmail.com").build();
    
            System.out.println(person1);
            System.out.println(person2);

            

    }
}
