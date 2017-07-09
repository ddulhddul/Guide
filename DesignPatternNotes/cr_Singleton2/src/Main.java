public class Main {
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		if(s1==s2){
			System.out.println("같은 인스턴스");
		}else{
			System.out.println("둘은 다른 인스턴스");
		}
		s1.anyMethod();
		s2.anyMethod();
	}
}
