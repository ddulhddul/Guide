class Ellipse extends Shape {
	public Ellipse() {
		this("Ÿ��");
	}

	public Ellipse(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}