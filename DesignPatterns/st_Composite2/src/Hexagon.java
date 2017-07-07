class Hexagon extends Shape {
	public Hexagon() {
		this("육각형");
	}

	public Hexagon(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}