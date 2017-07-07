import java.util.Random;

public class ConcreteCreatorB extends Creator {

    public Trans create(String type){
        Random r = new Random();
        switch (r.nextInt(3)) {
		case 1:
			return new Taxi();
		case 2:
			return new Bicycle();
		default:
			return new Bus();
		}
    }

}
