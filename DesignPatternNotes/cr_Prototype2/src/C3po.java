public class C3po extends Product {
	private String owner;

	public C3po(String owner) {
		this.owner = owner;
	}
	public void use(String s) {
		System.out.println(owner+" C3po: "+s);
	}
}
