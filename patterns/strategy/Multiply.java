package patterns.strategy;

public class  Multiply  implements Strategy{
    
    public void execute(int num1, int num2){

        System.out.println(num1 * num2);
    }
}
