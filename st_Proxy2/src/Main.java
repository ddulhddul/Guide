public class Main {
	public static void main(String[] args) {
		IPrintable p = new Proxy("Alice");
		System.out.println("������ �̸��� " + p.getPrinterName() + "�Դϴ�.");
		p.setPrinterName("Bob");
		System.out.println("������ �̸��� " + p.getPrinterName() + "�Դϴ�.");

		//p.print("Hello, world.");
	}
}
