package com.shapestone.oops;

public class MethodOverridingIcici extends MethodOverrindingBank {

	int getRateofIntrest() {
		System.out.println("ICICI Bank");
		return (8);
	}

	void Details() {
		System.out.println("card holder name is funny");
	}

	public static void main(String... args) {
		MethodOverridingSbi s = new MethodOverridingSbi();
		MethodOverridingIcici i = new MethodOverridingIcici();
		MethodOverrindingBank b = new MethodOverrindingBank();
		System.out.println("Bank rate of intrest is:" + b.getRateofIntrest());
		System.out.println("SBI rate of intrest is:" + s.getRateofIntrest());
		s.Details();
		System.out.println("Icici rate of intrest is:" + i.getRateofIntrest());
		s.Details();
	}

}
