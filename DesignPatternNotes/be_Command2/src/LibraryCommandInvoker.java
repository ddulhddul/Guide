import java.util.*;

public class LibraryCommandInvoker{
	private List<Command> history;
	private int lastCommand;

	public LibraryCommandInvoker(){
		history=new ArrayList<Command>();
	}
	public void executeCommand(Command lc){
		lc.execute();
		history.add(lc);
		lastCommand=history.size()-1;
	}
	public void redoNextCommand(){
		lastCommand++;
		if(lastCommand<history.size()) 
			((Command)history.get(lastCommand)).execute();
	}
	public void undoLastCommand(){
		((Command)history.get(lastCommand)).undo();
		lastCommand--;
	}
}
