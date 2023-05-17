package com.shapestone.variables;

class VariablesDemo {

	
	private static String name = "Shapestone";
	String myVariavble = "MyRules";
	
	{
		myVariavble = "MyRules1";
	}

	public static void main(String[] args) {
		// local variables of main
		int count = 0;
		int a, b, c;
		System.out.println(name);
		VariablesDemo demo1 = new VariablesDemo();
		demo1.instanceVariable1 = 10;
		demo1.myVariavble = "MyRule1";
		System.out.println("Instance variavble value is " + demo1.instanceVariable1);
		System.out.println("Static  variable valueis :: " + name);

		VariablesDemo demo2 = new VariablesDemo();
		demo2.instanceVariable1 = 20;
		VariablesDemo.name = "Nithish";
		demo1.myVariavble = "MyRule2";

		System.out.println("Instance variavble value is " + demo2.instanceVariable1);
		System.out.println("Static  variable valueis :: " + name);
		System.out.println("Instance variavble value is " + demo1.name);

	}
	int instanceVariable1;
	int outSideMethod;

	void display() {

	}
	/**
	 * 
	 */
}

