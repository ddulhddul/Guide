import java.util.Random;

public abstract class Creator {

    public abstract Trans create(String type);

    public static Creator newInstance(){
        Random r = new Random();
        if(r.nextInt(2) == 1) return new ConcreteCreatorA();
        else return new ConcreteCreatorB();
    }

}
