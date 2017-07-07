public class Main {
	public static void main(String[] args) {
		String s = "12-121-12321";
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < s.length(); i++) {
			Flyweight bc = factory.getBigChar(s.charAt(i));
			bc.print();
		}
	}
}
