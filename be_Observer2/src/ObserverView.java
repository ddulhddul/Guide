import java.util.*;
import java.awt.*;
import java.awt.event.*;

//1.implements Observer 
public class ObserverView implements Observer{
	private Frame main;
	private TextArea area;
	private Button button;

	public ObserverView(Stock stock) {
		// 3. Observable���� ���
		stock.addObserver(this);

		main = new Frame("Test");
		area = new TextArea(10, 40);
		button = new Button("�����");
		main.add(area);
		main.add(button, "South");
		main.pack();
		main.setVisible(true);
		
		main.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
	}

	@Override
	public void update(Observable o, Object arg) {
		// 2. notify�Ǿ����� ������ ����
		Stock stock = (Stock) o;
		area.append("The price of " + stock.getName() + " is now "
				+ stock.getPrice() + "\r\n");
		
	}

}