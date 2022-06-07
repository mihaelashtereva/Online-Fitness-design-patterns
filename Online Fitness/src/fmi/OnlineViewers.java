package fmi;

public class OnlineViewers implements Observer {

	private Observable trainee;
	private Boolean isDown;
	private String nickname;
	
	public OnlineViewers(String nickname)
	{
		this.nickname = nickname;
		
	}
	
	@Override
	public void update() {
		this.trainee.getUpdate();
		if(this.trainee == null)
		{
			System.out.println("No trainee.");	
			return;			
		}
		this.isDown = trainee.getUpdate();
		if(this.isDown)
		{
			System.out.println(this.nickname + " is down");	
					return;
		}
		
		System.out.println(this.nickname + " is up");	
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
		
	}
	
	//ToyFactory.getToy(string igrachka?);

}
