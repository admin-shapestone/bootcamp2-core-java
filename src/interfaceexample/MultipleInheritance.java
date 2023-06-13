package interfaceexample;

public interface MultipleInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
	}

}

interface A {
	void m1();
}

interface B {
	void m2();
}

class C implements A, B {
	public void m1() {
		System.out.println("from method one");
	}

	public void m2() {
		System.out.println("from method two");
	}
}