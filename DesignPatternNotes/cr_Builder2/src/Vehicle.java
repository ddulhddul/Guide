public class Vehicle {
	private String name;
	private int numberOfWheels;
	private boolean finished;
	private boolean tested;
	private boolean bodyBuilt;

	// accessor methods
	public String getName() {
		return name;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public boolean isBodyBuilt() {
		return bodyBuilt;
	}
	public boolean isFinished() {
		return finished;
	}
	public boolean isTested() {
		return tested;
	}
	public void setBodyBuilt() {
		bodyBuilt = true;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public void setFinished() {
		finished = true;
	}
	public void setTested() {
		tested = true;
	}
}
