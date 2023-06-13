package interfaceexample;

interface Atm {
	void deposite();

	void withDraw();

	public static void main(String[] args) {
		User u = new User();
		u.deposite();
		u.withDraw();
	}
}

class User implements Atm {
	public void deposite() {
		System.out.println("money deposite sucessfully");
	}

	public void withDraw() {
		System.out.println("money with draw sucessfully");
	}
}
