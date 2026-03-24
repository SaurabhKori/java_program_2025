package design_pattern;

public class Subcriber implements Observer {

	String name;

	Subcriber(String name) {
		this.name = name;
	}
	@Override
	public void notified(String title) {
		System.out.println("Hello " + name + " new video uploded : " + title);

	}

}
