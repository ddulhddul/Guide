public class PutOnHoldCommand implements Command{
	private String item;
	private String theString;

	public PutOnHoldCommand(String item, String theString){
		this.item=item;
		this.theString=theString;
	}
	public void execute(){
		System.out.println(item+" "+theString+" PutOnHoldCommand.execute()");
	}
	public void undo(){
		System.out.println(item+" "+theString+" PutOnHoldCommand.undo()");
	}
}
