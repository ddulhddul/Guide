public class Main {
	public static void main(String[] args) {
		// �غ�
		Manager manager = Manager.getInstance();

		// ����
		Product p1 = manager.create("r2d2");
		p1.use("open the Door!");
		Product p2 = manager.create("c3po");
		p2.use("Gfmmp, Qbuufso!");
		Product p3 = manager.create("sniper");
		p3.use("take a shot!");
		Product p4 = manager.create("ranger");
		p4.use("move!");
	}
}
