public class Clean implements State {
    
	//step2
	private static Clean instance = new Clean();
	//step1
	private Clean(){	}
	//step3
	public static Clean getInstance(){ return instance; }
	
    public void open(){
    	// 수행할 일 있으면 구현
    }

    public void close(){
    	// 수행할 일 있으면 구현
    }

    public void save(){
    	// 수행할 일 있으면 구현
    }

    public void edit(String text){
    	// 편집이 시작되면 Dirty 상태가 된다.
    	Document.setState(Dirty.getInstance());
    }
}
