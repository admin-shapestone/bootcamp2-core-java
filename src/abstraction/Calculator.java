package abstraction;

public abstract class Calculator {

	public abstract void addition(int i, int j);

	public abstract void substraction(int i, int j);

	public abstract void multiplication(int i, int j);

	public abstract void division(int i, int j);

	public static void main(String[] args) {
		Operation op = new Operation();
		op.addition(100, 200);
		op.substraction(100, 100);
		op.multiplication(100, 100);
		op.division(100, 100);
	}

}

class Operation extends Calculator {
	public void addition(int i, int j) {
		System.out.println(i + j);
	}

	public void substraction(int i, int j) {
		System.out.println(i - j);
	}

	public void multiplication(int i, int j) {
		System.out.println(i * j);
	}

	public void division(int i, int j) {
		System.out.println(i / j);
	}
}
