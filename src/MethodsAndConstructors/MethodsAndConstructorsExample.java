package MethodsAndConstructors;

public class MethodsAndConstructorsExample {

	int a = 10;
	int b = 20;

	public static void main(String[] args) { // TODO Auto-generated method stub
		MethodsAndConstructorsExample example = new MethodsAndConstructorsExample();
		example.addition();
		System.out.println(example.a+example.b);
		example.display();
	}

	private static void addition() {
		System.out.println(a+b);
		
	}

	/**
	 * Default constructor
	 */
	public MethodsAndConstructorsExample() {
		System.out.println("I'm from default constructor ....");
	}

	private void display() {
		System.out.println("I'm from display method...");
	}

}
