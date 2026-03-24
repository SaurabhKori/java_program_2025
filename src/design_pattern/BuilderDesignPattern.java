package design_pattern;

public class BuilderDesignPattern {
	/*
	 * While creating  object when object contain may atributes there are many problem exists:
	 * 1. We have to pass many arguments to create object 
	 * 2. some parameters might be optional.
	 * 3. Factory class takes all responsibility for creating object .if the object is heavy then all complexity is the part of factory class.
	 * So in builder pattern be create object step and finally return object with desired values of attributes
	 * */
	public static void main(String[] args) {
		UserBuilderDesign user = new UserBuilderDesign.UserBuilder().setEmailId("saurabh@gmail.com")
				.setUserName("Saurabh").setUserId("2323")
				.build();
		System.out.println(user);
	}
}
