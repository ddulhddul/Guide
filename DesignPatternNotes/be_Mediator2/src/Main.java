/* �ǽǼ������� 3�� û��! site
http://iilii.egloos.com/4850510�� ���� �߽��ϴ�.
Anti-nhn license�� �����ϴ�.
http://iilii.egloos.com/4445254
*/
public class Main {
	public static void main(String[] args) {
		Mediator tower=new ControlTower();
        
        for(int i=1; i<=5; i++){
            new Thread(new Airplane(tower, i)).start();
        }
    }
}


