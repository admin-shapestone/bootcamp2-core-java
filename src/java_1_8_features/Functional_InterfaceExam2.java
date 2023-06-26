package java_1_8_features;

@FunctionalInterface

interface Add {
	void Add(int a, int b);
}

class Sum implements Add {
	public void Add(int a, int b) {
		System.out.println("sum  = "+(a+b));
	}

}

public class Functional_InterfaceExam2 {

	public static void main(String[] args) {
		Sum b = new Sum();
		b.Add(10, 20);

	}

}
