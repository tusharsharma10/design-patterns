package principles;


public class Open {
    

    public static void main(String[] args) {
        
        Computer s = new Computer();

        // computer's execute method will be called
        s.execute();
        

        // cant call majors method.
    }

}

class Computer extends Science{

    @Override
    public void execute(){

        System.out.println("I have taken Computer Science");
    }

    public void majors(){
        System.out.println("Major in AI");
    }

}


class Finance implements Stream{

    public void execute(){

        System.out.println("I have taken Finance");

    }

}


class Commerce implements Stream{

    public void execute(){

        System.out.println("I have taken Commerce");
    }

}


class Science implements Stream{

    private int marks;

    public void execute(){

        System.out.println("I have taken Science");
    }

}


interface Stream{


    void execute();

}


