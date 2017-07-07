public class CheckInCommand implements Command{
	private String item;
	private String theString;

	public CheckInCommand(String item, String theString){
		this.item=item;
		this.theString=theString;
	}
	public void execute(){
		System.out.println(item+" "+theString+" CheckInCommand.execute()");
	}
	public void undo(){
		System.out.println(item+" "+theString+" CheckInCommand.undo()");
	}
}
