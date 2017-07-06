public class Main {
	public static void main(String[] args) {
		Shape d = new DrawingPaper();

		Shape t = new Triangle("��ĥ�� �ﰢ");
		Shape r = new Rectangle("���۳� �׸�");
		Shape p = new Pentagon("��~~ ������");
		Shape h = new Hexagon("�ÿ��� ������");
		Shape e = new Ellipse("��Ÿ��");
		Shape c = new Circle("���׶��");
		
		DrawingPaper dp = null;
		if(d instanceof DrawingPaper){
			dp = (DrawingPaper)d;
		}

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