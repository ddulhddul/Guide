class Ellipse extends Shape {
	public Ellipse() {
		this("타형");
	}

	public Ellipse(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}