import java.util.*;

public class Main{
	public static void main(String[] args){
		Collection<String> c=new HashSet<String>();
		c.add("ȫ�浿");
		c.add("�տ���");
		c.add("�����");
		Iterator<String> i=c.iterator();
		while(i.hasNext()){
			Object o=i.next();
			System.out.println(o);
		}
	}
}