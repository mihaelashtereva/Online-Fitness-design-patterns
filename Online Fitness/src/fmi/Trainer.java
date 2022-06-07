package fmi;

public class Trainer {
	private Command command;
	private static Trainer instance;
	
	Trainer() {}
	
	public static Trainer getInstance() {
		if(instance==null)
		{
			instance = new Trainer();
		}
		return instance;
		
	}
	
	public void setCommand(Command command)
	{
		this.command = command;		
	}
	
	public void coach() {
		if(this.command == null)
		{
			System.out.println("No command");	
			return;
		}
		this.command.execute();
	}
}
