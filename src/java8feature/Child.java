package java8feature;

@FunctionalInterface
public interface Child extends Parent {
	public void sayHello();
//	public void sayBye();

	default void sayOk() {
	};
	
}
