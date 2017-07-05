public class Singleton {
	
	//2. instance
	private static Singleton instance = new Singleton();
	
	//1. private
	private Singleton() {
		System.out.println("Singleton() "+this.toString());
	}
	
	//3. Instance
	public static Singleton getInstance(){
		return instance;
	}
	
	public void anyMethod(){
		System.out.println("anyMethod() "+this.toString());
	}
}