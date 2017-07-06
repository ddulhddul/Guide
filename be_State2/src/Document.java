public class Document {
	private String text = "";

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void open() {
		if("state".equals("Clean")){
			// ������ �� ������ ����
		}else if("state".equals("Dirty")){
			System.out.println("������ ������ �ֽ��ϴ�. ���Ͽ� �����ϰ� �ϰڽ��ϴ�...");
			save();
		}
		text = "  ## ���� ## ";
		System.out.println("\n���ο� ������ open�Ǿ����ϴ�.");
	}

	public void close() {
		if("state".equals("Clean")){
			// ������ �� ������ ����
		}else if("state".equals("Dirty")){
			System.out.println("������ ������ �ֽ��ϴ�. �����ϰ� �����ϰڽ��ϴ�");
			save();
		}
		System.out.println(text + " ������ close �Ǿ����ϴ�.");
		text = "";
	}

	public void save() {
		if("state".equals("Clean")){
			// ������ �� ������ ����
		}else if("state".equals("Dirty")){
			System.out.println("���系���� �����մϴ�.");
			// �����̵Ǹ� Clean ���°� �ȴ�.
		}
	}

	public void edit(String text) {
		this.text += text;
		System.out.println("������ ������ �����Ǿ����ϴ� :" + this.text);
		if("state".equals("Clean")){
			// ������ ���۵Ǹ� Dirty ���°� �ȴ�.
		}else if("state".equals("Dirty")){
			// ������ �� ������ ����
		}
	}
}