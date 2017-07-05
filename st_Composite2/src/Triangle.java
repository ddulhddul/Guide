class Triangle extends Shape {
	public Triangle() {
		this("삼각형");
	}

	public Triangle(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}
