public class Main {
	public static void main(String[] args) {
		// "leisure"
		Bicycle bicycle=new Bicycle();
		bicycle.go();
		
		System.out.println();
		
		// "normal"
		Bus bus=new Bus();
		bus.go();
		
		System.out.println();
		
		// "busy"
		Taxi taxi=new Taxi();
		taxi.go();
	}
}
