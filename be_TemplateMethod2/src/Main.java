public class Main {
	public static void main(String[] args) {
		Chess c=new Chess();
		String[] cplayers={"�տ���","�����"};
		c.play(cplayers);
		
		System.out.println();
		
		Monopoly m=new Monopoly();
		String[] mplayers={"�տ���","�����","���Ȱ�"};
		m.start(mplayers);
		
		System.out.println();
		
		BlueMarble b=new BlueMarble();
		String[] bplayers={"�տ���","ȫ�浿","�����","ȫ���"};
		b.go(bplayers);
	}
}
