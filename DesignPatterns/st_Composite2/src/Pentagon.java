class Pentagon extends Shape {
	public Pentagon() {
		this("������");
	}

	public Pentagon(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "��(��) �׸��ϴ�.");
	}
}