public class Main{
	public static void main(String[] args){
		Stock st=new Stock("ȫ�浿", "Google", 100);
		ObserverView  o1=new ObserverView(st);
		ObserverGraph o2=new ObserverGraph(st);
	}
}
