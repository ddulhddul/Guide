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
			// 수행할 일 있으면 구현
		}else if("state".equals("Dirty")){
			System.out.println("수정된 사항이 있습니다. 파일에 저장하고 하겠습니다...");
			save();
		}
		text = "  ## 문서 ## ";
		System.out.println("\n새로운 문서가 open되었습니다.");
	}

	public void close() {
		if("state".equals("Clean")){
			// 수행할 일 있으면 구현
		}else if("state".equals("Dirty")){
			System.out.println("수정된 사항이 있습니다. 저장하고 종료하겠습니다");
			save();
		}
		System.out.println(text + " 문서가 close 되었습니다.");
		text = "";
	}

	public void save() {
		if("state".equals("Clean")){
			// 수행할 일 있으면 구현
		}else if("state".equals("Dirty")){
			System.out.println("현재내용을 저장합니다.");
			// 저장이되면 Clean 상태가 된다.
		}
	}

	public void edit(String text) {
		this.text += text;
		System.out.println("문서의 내용이 수정되었습니다 :" + this.text);
		if("state".equals("Clean")){
			// 편집이 시작되면 Dirty 상태가 된다.
		}else if("state".equals("Dirty")){
			// 수행할 일 있으면 구현
		}
	}
}