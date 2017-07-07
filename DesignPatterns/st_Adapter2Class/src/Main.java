public class Main{
	public static void main(String[] args){
		IStringNewBuilder s=new Adapter("Hello");
		System.out.println(s.length()+" is length of "+s.toString());
		s.newMethod();
	}
}
