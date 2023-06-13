package abstraction;

public abstract class Bank {
	abstract int getRateOfIntrest();

	public static void main(String[] args) {
		Bank b = new Sbi();
		System.out.println("Rate of intrest is  :: " + b.getRateOfIntrest() + "%");
		Bank i = new Icic();
		System.out.println("Rate of intrest is  :: " + i.getRateOfIntrest() + "%");
	}
}
class Sbi extends Bank {
	int getRateOfIntrest() {
		return 7;
	}
}
class Icic extends Sbi {
	int getRateOfIntrest() {
		return 8;
	}
}
