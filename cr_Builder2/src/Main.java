public class Main {
	public static void main(String args[]) {
		Builder b = Builder.newInstance("F1");
		Director d = new Director(b);
		d.buildVehicle();
		
		/*
		// "F1"
		F1Creator f1 = new F1Creator();
		f1.buildVehicle();
		
		System.out.println();
		
		// "bike" 
		BicycleCreator bicycle = new BicycleCreator();
		bicycle.buildVehicle();
		
		System.out.println();
		
		// "plane"
		PlaneCreator plane = new PlaneCreator();
		plane.buildVehicle();
		*/
	}
}
