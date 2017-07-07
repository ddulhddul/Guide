public abstract class Singleton {
	
	//2. instance
	private static Singleton instance = new ConcreteSingletonB();
	
	//1. private
//	private Singleton() {
	public Singleton() {
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