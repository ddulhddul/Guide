public class Document {
	private String text = "";
	private static State state= Clean.getInstance();
	public static void setState(State newstate){
		state = newstate;
	}
	

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void open() {
		state.open();
		text = "  ## ���� ## ";
		System.out.println("\n���ο� ������ open�Ǿ����ϴ�.");
	}

	public void close() {
		state.close();
		System.out.println(text + " ������ close �Ǿ����ϴ�.");
		text = "";
	}

	public void save() {
		state.save();
	}

	public void edit(String text) {
		this.text += text;
		System.out.println("������ ������ �����Ǿ����ϴ� :" + this.text);
		state.edit(text);
	}
}