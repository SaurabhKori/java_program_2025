package java8feature;

@FunctionalInterface
public interface FunctionalInterfaces {
	public void sayHello();

	default void sayBye() {
	};

	public static void sayOk() {
	};
}
