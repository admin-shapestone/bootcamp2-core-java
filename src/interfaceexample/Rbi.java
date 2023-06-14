package interfaceexample;

public interface Rbi {

	void withDraw();

	void deposite();

	void minimumBalance();

	default void Kyc() {
		System.out.println("update you are kyc");
	}

}

class Sbi implements Rbi {

	@Override
	public void withDraw() {
		System.out.println("money withdraw from sbi");

	}

	@Override
	public void deposite() {

		System.out.println("money deposite from sbi");
	}

	@Override
	public void minimumBalance() {

		System.out.println("maintain minimum balance 2000 from sbi");
	}

}

class Icic implements Rbi {

	@Override
	public void withDraw() {

		System.out.println("money withdraw from icic");
	}

	@Override
	public void deposite() {

		System.out.println("money deposite from icic");
	}

	@Override
	public void minimumBalance() {
		System.out.println("maintain minimum balance 4000 from icic");

	}

}
