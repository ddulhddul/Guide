public class Main {
	public static void main(String[] args) {
		DrawingPaper dp = new DrawingPaper();

		Shape t = new Triangle("까칠한 삼각");
		Shape r = new Rectangle("구멍난 네모");
		Shape p = new Pentagon("아~~ 오지명");
		Shape h = new Hexagon("시원한 육각수");
		Shape e = new Ellipse("긴타원");
		Shape c = new Circle("동그라미");

		dp.add(t);
		dp.add(r);
		dp.add(p);
		dp.add(h);
		dp.add(e);
		dp.add(c);

		dp.draw();

		System.out.println();

		dp.remove(t);
		dp.remove(r);

		dp.draw();
	}
}