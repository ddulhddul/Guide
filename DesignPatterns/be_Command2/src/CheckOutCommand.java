public class CheckOutCommand implements Command{
	private String item;
	private String theString;

	public CheckOutCommand(String item, String theString){
		this.item=item;
		this.theString=theString;
	}
	public void execute(){
		System.out.println(item+" "+theString+" CheckOutCommand.execute()");
	}
	public void undo(){
		System.out.println(item+" "+theString+" CheckOutCommand.undo()");
	}
}
