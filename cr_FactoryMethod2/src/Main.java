public class Main {
	public static void main(String[] args) {
		Creator c = Creator.newInstance();
		
		// "leisure"
//		Bicycle bicycle=new Bicycle();
//		bicycle.go();
		Trans t = c.create("leisure");
		t.go();
		
//		System.out.println();
		
		// "normal"
//		Bus bus=new Bus();
//		bus.go();
		
//		System.out.println();
		
		// "busy"
//		Taxi taxi=new Taxi();
//		taxi.go();
	}
}
