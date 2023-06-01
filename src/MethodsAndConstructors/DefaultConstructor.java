package MethodsAndConstructors;

public class DefaultConstructor {
	
	int someNumber;
	int someNumber2;
	int someNumber3;
	int someNumber4;
	int someNumber5;
	

	public DefaultConstructor() {
		
	}
	
	public DefaultConstructor(int someNumber) {
		super();
		this.someNumber = someNumber;
	}

	public DefaultConstructor(int someNumber1, int someNumber2) {
		this.someNumber = someNumber1;
		this.someNumber2 = someNumber2;
	}
	public DefaultConstructor(int someNumber1, int someNumber2, int someNumber3) {
		this.someNumber = someNumber1;
		this.someNumber2 = someNumber2;
		this.someNumber3 = someNumber3;

	}
	
	public DefaultConstructor(int someNumber1, int someNumber2, int someNumber3, int someNumber4) {
		this.someNumber = someNumber1;
		this.someNumber2 = someNumber2;
		this.someNumber3 = someNumber3;
		this.someNumber4 = someNumber4;

		
	}
	
	public DefaultConstructor(int someNumber1, int someNumber2, int someNumber3, int someNumber4, int somNumber5) {
		this.someNumber = someNumber1;
		this.someNumber2 = someNumber2;
		this.someNumber3 = someNumber3;
		this.someNumber4 = someNumber4;
		this.someNumber5 = somNumber5;
	}
	

	public static void main(String[] args) {
		DefaultConstructor defaultConstructor = new DefaultConstructor();
		DefaultConstructor constructor1 = new DefaultConstructor(10);
		DefaultConstructor constructor2 = new DefaultConstructor(10,20);
		DefaultConstructor constructor3 = new DefaultConstructor(10,20,30);
		DefaultConstructor constructor4 = new DefaultConstructor(10,20,30,40);
		DefaultConstructor constructor5 = new DefaultConstructor(10,20,30,40,50);


		defaultConstructor.m1();
	}
	
	void m1() {
		System.out.println("M1..." + someNumber);
	}

}
