package patterns.command;

import java.util.ArrayList;
import java.util.List;

//invoker
public class Switcher {

	public List<Command> commandList;
	
	public Switcher(){
		this.commandList = new ArrayList<>();
	}
	
	public void addCommand(Command command){
		this.commandList.add(command);
	}
	
	//execute commands from the list
	public void executeCommands(){
		for(Command command : this.commandList){
			command.execute();
		}
	}
}
