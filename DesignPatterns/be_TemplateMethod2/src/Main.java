public class Main {
	public static void main(String[] args) {
		Game c=new Chess();
		String[] cplayers={"�տ���","�����"};
		c.play(cplayers);
		
		System.out.println();
		
		Game m=new Monopoly();
		String[] mplayers={"�տ���","�����","���Ȱ�"};
		m.play(mplayers);
		
		System.out.println();
		
		Game b=new BlueMarble();
		String[] bplayers={"�տ���","ȫ�浿","�����","ȫ���"};
		b.play(bplayers);
	}
}
