public class Clean implements State {
    
	//step2
	private static Clean instance = new Clean();
	//step1
	private Clean(){	}
	//step3
	public static Clean getInstance(){ return instance; }
	
    public void open(){
    	// ������ �� ������ ����
    }

    public void close(){
    	// ������ �� ������ ����
    }

    public void save(){
    	// ������ �� ������ ����
    }

    public void edit(String text){
    	// ������ ���۵Ǹ� Dirty ���°� �ȴ�.
    	Document.setState(Dirty.getInstance());
    }
}
