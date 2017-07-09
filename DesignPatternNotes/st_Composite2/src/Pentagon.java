class Pentagon extends Shape {
	public Pentagon() {
		this("오각형");
	}

	public Pentagon(String name) {
		super.setName(name);
	}

	public void draw() {
		System.out.println(super.getName() + "을(를) 그립니다.");
	}
}