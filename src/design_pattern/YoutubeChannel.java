package design_pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
	List<Observer> subscribers = new ArrayList();

	@Override
	public void subscribe(Observer ob) {
		// TODO Auto-generated method stub
		this.subscribers.add(ob);

	}

	@Override
	public void unsubscribe(Observer ob) {
		// TODO Auto-generated method stub
		this.subscribers.remove(ob);
	}

	@Override
	public void newVideoUploaded(String title) {
		// TODO Auto-generated method stub
		for (Observer ob : this.subscribers) {
			ob.notified(title);
		}
	}

}
