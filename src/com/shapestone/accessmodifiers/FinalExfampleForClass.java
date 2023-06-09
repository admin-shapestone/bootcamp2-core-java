package com.shapestone.accessmodifiers;

class FinalExfampleForClass {

	public static void main(String[] args) {
		Final2 demo = new Final2();
		demo.method2();
	}
}

final class Final1 // if we remove final modifier the code compiles fine
{
	void method1() {
		System.out.println("this is from B class");
	}
}

class Final2 extends Final1 // we will get C.T.E because finalexample class declared as final
{
	void method2() {
		System.out.println("this from final class");
	}

}