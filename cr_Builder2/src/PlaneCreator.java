public class PlaneCreator {
	public void buildVehicle() {
		// step1 - create the job
		Vehicle vehicle = new Vehicle();

		// step2 - build the body of the vehicle
		vehicle.setName("Boeing747");
		vehicle.setBodyBuilt();

		// step3 - attach the wheels
		vehicle.setNumberOfWheels(6);

		// step4 - test the finished article
		vehicle.setTested(/* Plane */);
		vehicle.setFinished(/* Plane */);

		// step5 - output details of the vehicle
		System.out.println("Vehicle's name ["+vehicle.getName()+"]");
		System.out.println("Body built ["+vehicle.isBodyBuilt()+"]");
		System.out.println("Number of wheels ["+vehicle.getNumberOfWheels()+"]");
		System.out.println("Vehicle serviceable ["+vehicle.isTested()+"]");
		System.out.println("Vehicle ready ["+vehicle.isFinished()+"]");
	}
}
