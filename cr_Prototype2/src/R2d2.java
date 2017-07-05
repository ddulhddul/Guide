public class R2d2 extends Product {
	private String owner;

	public R2d2(String owner) {
		this.owner = owner;
	}
	public void use(String s) {
		System.out.println(owner+" R2d2: ~!@#$%^&*()~!@#$%^&*()");
	}
}
