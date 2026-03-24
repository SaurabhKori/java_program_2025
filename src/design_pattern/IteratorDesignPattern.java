package design_pattern;

public class IteratorDesignPattern {
//The iterator pattern provides a way to access the elements of an object without exposing its underlying implements.
	public static void main(String[] args) {
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User("Saurabh", "11"));
		userManagement.addUser(new User("Gaurav", "12"));
		userManagement.addUser(new User("Ankit", "13"));
		userManagement.addUser(new User("Dhanush", "14"));
		MyIterator myIterator = userManagement.getIterator();
		while (myIterator.hashNext()) {
			System.err.println((User) myIterator.next());
		}
	}
}
