class Triangle extends Shape {
	public Triangle() {
		this("�ﰢ��");
	}

	public Triangle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}
