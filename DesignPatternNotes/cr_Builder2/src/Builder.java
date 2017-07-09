public abstract class Builder {

    protected Vehicle vehicle;

	public abstract void build();
	public abstract void attach();
	public abstract void test();
	
	public void output() {
		// step5 - output details of the vehicle
		System.out.println("Vehicle's name ["+vehicle.getName()+"]");
		System.out.println("Body built ["+vehicle.isBodyBuilt()+"]");
		System.out.println("Number of wheels ["+vehicle.getNumberOfWheels()+"]");
		System.out.println("Vehicle serviceable ["+vehicle.isTested()+"]");
		System.out.println("Vehicle ready ["+vehicle.isFinished()+"]");
	}

	public void create() {
		// step1 - create the job
		vehicle = new Vehicle();
	}
	
	public static Builder newInstance(String type){
		if("F1".equalsIgnoreCase(type)){
			return new F1Builder();
		}else if("plane".equalsIgnoreCase(type)){
			return new PlaneBuilder();
		}else{
			return new BicycleBuilder();
		}
	}

}
