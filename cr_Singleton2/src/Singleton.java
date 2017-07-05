public class Singleton {
	
	//2. instance
	private static Singleton instance;
	
	//1. private
	private Singleton() {
		System.out.println("Singleton() "+this.toString());
	}
	
	//3. Instance
	public static Singleton getInstance(){
		//가끔 사용할 경우...
		if(instance == null) instance = new Singleton();
		return instance;
	}
	
	public void anyMethod(){
		System.out.println("anyMethod() "+this.toString());
	}
}