class Circle extends Shape {
	public Circle() {
		this("��");
	}

	public Circle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}