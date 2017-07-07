public class Main {
	public static void main(String[] args) {
		IPrintable p = new Proxy("Alice");
		System.out.println("현재의 이름은 " + p.getPrinterName() + "입니다.");
		p.setPrinterName("Bob");
		System.out.println("현재의 이름은 " + p.getPrinterName() + "입니다.");

		//p.print("Hello, world.");
	}
}
