class DrawingPaper extends Shape {
	private Shape[] paper;
	private int index;

	public DrawingPaper(int size) {
		paper = new Shape[size];
	}
	public DrawingPaper() {
		this(100);
	}

	public void add(Shape shape) {
		paper[index++] = shape;
	}
	public void remove(Shape shape) {
		for (int i = 0; i < index; i++) {
			if (paper[i].getName().equals(shape.getName())) {
				for (int j = i; j < index-1; j++)
					paper[j] = paper[j + 1];
				paper[index--]=null;
				System.out.println(shape.getName() + " remove OK\n");
				return;
			}
		}
		System.out.println(shape.getName() + " not found\n");
	}
	public Shape getChild(int index) {
		return (index > this.index) ? null : paper[index];
	}
	public void draw() {
		for (int i = 0; i < index; i++)
			paper[i].draw();
	}
}