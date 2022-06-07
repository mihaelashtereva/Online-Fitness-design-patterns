package fmi;

public class GetDownCommand implements Command{

	private Trainee trainee; //reciever
	
	public GetDownCommand(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	public void execute() {
		System.out.println("Get down.");	
		this.trainee.getDown();
		
	}

	@Override
	public void undo() {
		this.trainee.getUp();
		
	}

}
