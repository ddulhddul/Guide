public class Room {
	String type;

	public Room() {

	}
	public Room(String type) {
		this.type = type;
	}

	public void issueWakeUpCall() {
		System.out.println("WakeUp!!");
	}

	public void updateStatus() {
		System.out.println("update Room status..");
	}

	public String toString() {
		return type;
	}
}
