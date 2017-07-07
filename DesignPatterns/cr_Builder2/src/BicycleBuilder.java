public class BicycleBuilder extends Builder {
	public void test() {
		// step4 - test the finished article
		vehicle.setTested(/* Bicycle */);
		vehicle.setFinished(/* Bicycle */);
	}

	public void attach() {
		// step3 - attach the wheels
		vehicle.setNumberOfWheels(2);
	}

	public void build() {
		// step2 - build the body of the vehicle
		vehicle.setName("Raleigh 80");
		vehicle.setBodyBuilt();
	}
}
