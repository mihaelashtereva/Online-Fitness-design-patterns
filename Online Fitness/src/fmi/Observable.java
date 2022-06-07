package fmi;

public interface Observable {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notifyObserver();
   Boolean getUpdate();
	
}
