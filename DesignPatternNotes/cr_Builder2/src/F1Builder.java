public class F1Builder extends Builder {
	public void test() {
		// step4 - test the finished article
		vehicle.setTested(/* F1 */);
		vehicle.setFinished(/* F1 */);
	}

	public void attach() {
		// step3 - attach the wheels
		vehicle.setNumberOfWheels(4);
	}

	public void build() {
		// step2 - build the body of the vehicle
		vehicle.setName("McLaren MP13/14");
		vehicle.setBodyBuilt();
	}
}
