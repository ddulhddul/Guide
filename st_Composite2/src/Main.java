public class Main {
	public static void main(String[] args) {
		DrawingPaper dp = new DrawingPaper();

		Shape t = new Triangle("��ĥ�� �ﰢ");
		Shape r = new Rectangle("���۳� �׸�");
		Shape p = new Pentagon("��~~ ������");
		Shape h = new Hexagon("�ÿ��� ������");
		Shape e = new Ellipse("��Ÿ��");
		Shape c = new Circle("���׶��");

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