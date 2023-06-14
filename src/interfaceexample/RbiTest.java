package interfaceexample;

public class RbiTest {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.deposite();
		s.withDraw();
		s.minimumBalance();
		s.Kyc();

		Icic ic = new Icic();
		ic.deposite();
		ic.withDraw();
		ic.minimumBalance();
		s.Kyc();
	}

}
