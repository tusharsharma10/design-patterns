package patterns.strategy;

public class OperationManager {
    
    /**
     *  using composition over inheritance
     *  because behaviour can be changed at runtime
     */
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * Helps to change behavior at runtime
     * @param num1
     * @param num2
     */
    public void execute(int num1, int num2){
        this.strategy.execute(num1, num2);
    }

}
