public class Main{
	public static void main(String args[]){
		Document doc = new Document();
		doc.open();
		doc.edit("하이");
		doc.save();
		doc.save(); //문서가 저장된 Clean한 상태임으로 아무일을 안함

		doc.open();
		doc.edit("My name is 홍길동");

		doc.open();
		doc.close();

		doc.open();
		doc.edit("하하");
		doc.close();
   }
}