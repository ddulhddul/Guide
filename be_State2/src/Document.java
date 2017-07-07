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
		text = "  ## 문서 ## ";
		System.out.println("\n새로운 문서가 open되었습니다.");
	}

	public void close() {
		state.close();
		System.out.println(text + " 문서가 close 되었습니다.");
		text = "";
	}

	public void save() {
		state.save();
	}

	public void edit(String text) {
		this.text += text;
		System.out.println("문서의 내용이 수정되었습니다 :" + this.text);
		state.edit(text);
	}
}