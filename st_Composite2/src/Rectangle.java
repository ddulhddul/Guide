class Rectangle extends Shape {
	public Rectangle() {
		this("�簢��");
	}

	public Rectangle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}