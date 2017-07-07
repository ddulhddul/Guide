public class Dirty implements State {
    
	private static Dirty instance = new Dirty();
	private Dirty(){    }
	public static Dirty getInstance(){ return instance; }
    
	public void open(){
		System.out.println("수정된 사항이 있습니다. 파일에 저장하고 하겠습니다...");
		save();
    }

    public void close(){
    	System.out.println("수정된 사항이 있습니다. 저장하고 종료하겠습니다");
		save();
    }

    public void save(){
    	System.out.println("현재내용을 저장합니다.");
		// 저장이되면 Clean 상태가 된다.
    	Document.setState(Clean.getInstance());
    }

    public void edit(String text){
    	// 수행할 일 있으면 구현
    }
}
