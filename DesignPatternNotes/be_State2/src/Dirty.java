public class Dirty implements State {
    
	private static Dirty instance = new Dirty();
	private Dirty(){    }
	public static Dirty getInstance(){ return instance; }
    
	public void open(){
		System.out.println("������ ������ �ֽ��ϴ�. ���Ͽ� �����ϰ� �ϰڽ��ϴ�...");
		save();
    }

    public void close(){
    	System.out.println("������ ������ �ֽ��ϴ�. �����ϰ� �����ϰڽ��ϴ�");
		save();
    }

    public void save(){
    	System.out.println("���系���� �����մϴ�.");
		// �����̵Ǹ� Clean ���°� �ȴ�.
    	Document.setState(Clean.getInstance());
    }

    public void edit(String text){
    	// ������ �� ������ ����
    }
}
