public class Main{
	public static void main(String[] args){
		LibraryCommandInvoker lci=new LibraryCommandInvoker();

		lci.executeCommand(new CheckInCommand("1","ȫ�浿"));
		lci.executeCommand(new PutOnHoldCommand("2","�����"));
		System.out.println();
		
		lci.undoLastCommand();
		lci.redoNextCommand();
		System.out.println();
		
		lci.executeCommand(new CheckOutCommand("3","���Ȱ�"));
	}
}