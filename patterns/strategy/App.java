package patterns.strategy;

public class App {
    
    public static void main(String[] args) {
        
        OperationManager mgr = new OperationManager();
        mgr.setStrategy(new Addition());
        mgr.execute(20, 5);
    }
}
