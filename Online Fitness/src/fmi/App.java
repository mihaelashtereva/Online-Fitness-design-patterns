package fmi;

public class App {

	public static void Main(String[] args)
	{
		Trainer trainer = Trainer.getInstance();
		Trainee trainee = new Trainee();
		
		Command getUpCommand = new GetUpCommand(trainee);
		Command getDownCommand = new GetDownCommand(trainee);
		
		OnlineViewers viewer1 = new OnlineViewers("v1");
		OnlineViewers viewer2 = new OnlineViewers("v2");
		OnlineViewers viewer3 = new OnlineViewers("v3");
		
		trainee.subscribe(viewer3);
		trainee.subscribe(viewer1);		
		trainee.subscribe(viewer2);
		
		trainer.setCommand(getUpCommand);
		trainer.coach();
		
		trainer.setCommand(getDownCommand);
		trainer.coach();
	}
}
