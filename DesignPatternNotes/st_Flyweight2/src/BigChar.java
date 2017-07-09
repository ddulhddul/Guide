import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar extends Flyweight {
	// ������ �̸�
	@SuppressWarnings("unused")
	private char charname;
	// ū ���ڸ� ǥ���ϴ� ���ڿ�('#' '.' '\n'�� ��)
	String fontdata;

	// ������
	public BigChar(char charname) {
		this.charname = charname;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/big" + charname + ".txt"));
			String line;
			StringBuilder buf = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();
		} catch (IOException e) {
			this.fontdata = charname + "?";
		}
	}
	
	public void print() {
		System.out.print(fontdata);
	}
}
