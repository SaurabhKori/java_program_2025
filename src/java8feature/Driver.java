package java8feature;

public class Driver {
	public static void main(String[] args) {
//		Employee emp = new SoftwareEngineer();
//		System.out.println(emp.getName());
		Employee employee = () -> {
			return "Software Engineer";
		};
		System.out.println(employee.getName());
	}
}
