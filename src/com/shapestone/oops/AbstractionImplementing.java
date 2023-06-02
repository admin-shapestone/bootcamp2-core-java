package com.shapestone.oops;

public class AbstractionImplementing extends Abstraction
{

	public AbstractionImplementing(int i) {
		super(i=100);
		System.out.println(i);
	}


	@Override
	public void Animal() {
		System.out.println(" cat daily drink milk");
	}
   public void Human() {
	   System.out.println(" humans eat rice");
   }
   public void Align() {
	   System.out.println(" align doesnt eat anything");
   }
   
   
   
}

