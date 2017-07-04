public class Main {
	public static void main(String[] args) {
		Game c=new Chess();
		String[] cplayers={"손오공","사오정"};
		c.play(cplayers);
		
		System.out.println();
		
		Game m=new Monopoly();
		String[] mplayers={"손오공","사오정","저팔계"};
		m.play(mplayers);
		
		System.out.println();
		
		Game b=new BlueMarble();
		String[] bplayers={"손오공","홍길동","사오정","홍길순"};
		b.play(bplayers);
	}
}
