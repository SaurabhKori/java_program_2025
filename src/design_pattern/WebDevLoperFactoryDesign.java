package design_pattern;

public class WebDevLoperFactoryDesign implements EmployeeFactoryDesignPattern {

	@Override
	public int getSalary() {
		System.out.println("Getting web developer Salary");
		return 40000;
	}

}
