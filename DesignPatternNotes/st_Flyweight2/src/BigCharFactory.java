import java.util.*;

public class BigCharFactory {
	// �̹� ������� BigChar�� �ν��Ͻ��� ����
	private Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
	
	// Singleton ����
	private static BigCharFactory singleton = new BigCharFactory();
	// ������
	private BigCharFactory() {}
	// ������ �ϳ��� �ν��Ͻ��� ��´�.
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	// BigChar�� �ν��Ͻ� ����(����)
	public synchronized Flyweight getBigChar(char charname) {
		BigChar bc = (BigChar) pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname); // ���⿡�� BigChar�� �ν��Ͻ��� ����
			pool.put("" + charname, bc);
		}
		return bc;
	}
}
