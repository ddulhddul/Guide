class Rectangle extends Shape {
	public Rectangle() {
		this("사각형");
	}

	public Rectangle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}