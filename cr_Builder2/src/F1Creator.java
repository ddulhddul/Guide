public class F1Creator {
	public void buildVehicle() {
		// step1 - create the job
		Vehicle vehicle = new Vehicle();

		// step2 - build the body of the vehicle
		vehicle.setName("McLaren MP13/14");
		vehicle.setBodyBuilt();

		// step3 - attach the wheels
		vehicle.setNumberOfWheels(4);

		// step4 - test the finished article
		vehicle.setTested(/* F1 */);
		vehicle.setFinished(/* F1 */);

		// step5 - output details of the vehicle
		System.out.println("Vehicle's name ["+vehicle.getName()+"]");
		System.out.println("Body built ["+vehicle.isBodyBuilt()+"]");
		System.out.println("Number of wheels ["+vehicle.getNumberOfWheels()+"]");
		System.out.println("Vehicle serviceable ["+vehicle.isTested()+"]");
		System.out.println("Vehicle ready ["+vehicle.isFinished()+"]");
	}
}
