package java_1_8_features;

@FunctionalInterface
interface A {
	void show(); // An Interface contain only one Abstract is known as "functional Interface".It
					// is also know as single abstract method Interface.

	default void Show1() // A functional Interface contain N number of default methods and abstract
							// methods.
	{
		System.out.println("default method");
	}

	static void show2() {
		System.out.println("Static method");
	}
}

class B implements A {
	public void show() {
		System.out.println("functional iterface");
	}
}

public class Functional_Interface {
	public static void main(String[] args) {

		B b = new B();
		b.show();
		b.Show1();
		A.show2();
	}
}
