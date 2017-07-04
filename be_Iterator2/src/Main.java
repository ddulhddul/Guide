import java.util.*;

public class Main{
	public static void main(String[] args){
		Collection<String> c=new HashSet<String>();
		c.add("홍길동");
		c.add("손오공");
		c.add("사오정");
		Iterator<String> i=c.iterator();
		while(i.hasNext()){
			Object o=i.next();
			System.out.println(o);
		}
	}
}