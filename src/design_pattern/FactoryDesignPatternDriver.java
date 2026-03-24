package design_pattern;

public class FactoryDesignPatternDriver {
	/*
	 * Factory Design Pattern 
	 * when there is superclass and multiple subclass and we want to get object of subclasses based on input and requirement.
	 * There is create factory class which takes the responsibility of creating object of class based on input 
	 * Advantage of Factory Design Pattern 
	 * ! focus on creating object for interface rather than implementation
	 * 2 .Loose coupling more robust code 
	 * 
	 * */
	public static void main(String[] args) {
		EmployeeFactoryDesignPattern emp = EmployeeFactory.getEmployee("Android");
		emp.getSalary();
	}
}
