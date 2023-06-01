package MethodsAndConstructors;

public class FlowExecution {

	void m1() {
		m2();
		System.out.println("I'm from M1 method");
	}

	private void m2() {
		m3();
		System.out.println("I'm from m2 method");

	}

	private static void m3() {
		m4();
		System.out.println("I'm from m3 method");

	}

	private static void m4() {
		m3();
		System.out.println("I'm from m4 method");

	}

	public static void main(String[] args) {
		/*
		 * FlowExecution t = new FlowExecution(); t.m1(); m4();
		 */
		
		
		Student s = new Student();
		System.out.println(s.toString());
	}

}
