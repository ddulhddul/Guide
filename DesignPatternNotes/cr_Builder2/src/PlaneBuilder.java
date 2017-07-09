public class PlaneBuilder extends Builder {
	public void test() {
		// step4 - test the finished article
		vehicle.setTested(/* Plane */);
		vehicle.setFinished(/* Plane */);
	}

	public void attach() {
		// step3 - attach the wheels
		vehicle.setNumberOfWheels(6);
	}

	public void build() {
		// step2 - build the body of the vehicle
		vehicle.setName("Boeing747");
		vehicle.setBodyBuilt();
	}
}
