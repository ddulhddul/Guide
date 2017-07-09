public class Adapter implements IStringNewBuilder {

	private ConcreteStringBuilderA sb;

    public Adapter(String s){
    	sb = new ConcreteStringBuilderA(s);
    }

    //���� (Delegation) : �׳� ����
    @Override
    public int length() {
    	// TODO Auto-generated method stub
    	return sb.length();
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "!!!"+sb.toString();
    }

    public void newMethod(){
    	System.out.println("new Method ~~");
    }

}
