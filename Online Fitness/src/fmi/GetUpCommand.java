package fmi;

public class GetUpCommand implements Command{ //dai mi .. igrachki

	private Trainee trainee; //reciever
	
	public GetUpCommand(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	@Override
	public void execute() {
		System.out.println("Get up");	
		this.trainee.getUp();
		
	}

	@Override
	public void undo() {
		this.trainee.getDown();
		
	}

}
