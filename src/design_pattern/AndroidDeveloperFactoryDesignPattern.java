package design_pattern;

public class AndroidDeveloperFactoryDesignPattern implements EmployeeFactoryDesignPattern {

	@Override
	public int getSalary() {
		System.out.println("Getting android developer salary");
		return 500000;
	}

}
