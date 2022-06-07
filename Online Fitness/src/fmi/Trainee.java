package fmi;

import java.util.List;

public class Trainee implements Observable{
	private Boolean isDown;
	private List<Observer> onlineViewers;
	
	public Trainee()
	{
		
		
	}
	
	public void getDown() {
		this.isDown = true;	
		System.out.println("Trainee is down");
		this.notify();
	}
	
	public void getUp() {
		this.isDown = false;	
		System.out.println("Trainee is up");
		this.notify();
	}

	@Override
	public void subscribe(Observer observer) {
		this.onlineViewers.add(observer);
		observer.setTrainee(this);		
	}

	
	public void notifyObserver() {
		for(Observer viewer : this.onlineViewers) {
			viewer.update();		
		}
			
	}
	
	@Override
	public void unsubscribe(Observer observer) {
		this.onlineViewers.remove(observer);
		observer.setTrainee(null);
	}

	@Override
	public Boolean getUpdate() {
		return this.isDown;
	}
}
