public class Printer implements IPrintable {
	private String name;

	public Printer() {
		heavyJob("Printer�� �ν��Ͻ��� ������");
	}
	public Printer(String name) { // ������
		this.name = name;
		heavyJob("Printer�� �ν��Ͻ�(" + name + ")�� ������");
	}

	public void setPrinterName(String name) { // �̸��� ����
		this.name = name;
	}
	public String getPrinterName() { // �̸��� ���
		return name;
	}

	public void print(String msg) { // �̸��� �ٿ��� ǥ��
		System.out.println("=== " + name + " ===");
		System.out.println(msg);
	}
	private void heavyJob(String msg) { // ���ſ� �۾�
		System.out.print(msg);
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("�Ϸ�");
	}
}
