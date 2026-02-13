package java8feature;

interface A {
	default void sayHello() {
		System.out.println("I  am A Boss");
	}
}

interface B {
	default void sayHello() {
		System.out.println("I  am B Boss");
	}
}

class C {
	int a = 12;
}

public class MyClass extends C implements A, B {
	int a = 10;
	public static void main(String[] args) {
		MyClass b = new MyClass();
		b.sayHello();

	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		A.super.sayHello();
		System.out.println(super.a + this.a);
		B.super.sayHello();
	}

}
