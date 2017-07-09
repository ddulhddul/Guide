/* 건실성실착실 3실 청년! site
http://iilii.egloos.com/4850510를 참고 했습니다.
Anti-nhn license을 따릅니다.
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


