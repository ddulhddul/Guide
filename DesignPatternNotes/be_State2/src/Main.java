public class Main{
	public static void main(String args[]){
		Document doc = new Document();
		doc.open();
		doc.edit("����");
		doc.save();
		doc.save(); //������ ����� Clean�� ���������� �ƹ����� ����

		doc.open();
		doc.edit("My name is ȫ�浿");

		doc.open();
		doc.close();

		doc.open();
		doc.edit("����");
		doc.close();
   }
}