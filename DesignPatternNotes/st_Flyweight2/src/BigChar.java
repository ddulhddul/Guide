import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar extends Flyweight {
	// 문자의 이름
	@SuppressWarnings("unused")
	private char charname;
	// 큰 문자를 표현하는 문자열('#' '.' '\n'의 열)
	String fontdata;

	// 생성자
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
