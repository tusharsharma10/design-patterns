package patterns.prototype;

public class App {
    
    public static void main(String[] args) {

        Shape sq  = new Square(20, 20);
        sq.draw();

        Shape cloneSq = sq.cloneObject();
        cloneSq.draw();

    }
}
