public class Droid extends Product {
	private String type;

	public Droid(String type) {
		this.type = type;
	}
	public void use(String s) {
		System.out.println(type+": "+s);
	}
}
