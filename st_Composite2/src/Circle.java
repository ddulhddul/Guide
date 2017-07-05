class Circle extends Shape {
	public Circle() {
		this("원");
	}

	public Circle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}