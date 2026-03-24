package design_pattern;

public class EmployeeFactory {
	public static EmployeeFactoryDesignPattern getEmployee(String empType) {
		if (empType.trim().equalsIgnoreCase("Android")) {
			return new AndroidDeveloperFactoryDesignPattern();
		} else if (empType.trim().equalsIgnoreCase("Web")) {
			return new WebDevLoperFactoryDesign();
		} else {
			return null;
		}
	}

}
