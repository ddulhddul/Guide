class Hexagon extends Shape {
	public Hexagon() {
		this("������");
	}

	public Hexagon(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}