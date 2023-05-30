package com.shapestone.staticandinstancesflow;

public class InstanceFlowChild extends InstanceFlowParent {
	
	int j;
	{
		System.out.println(j);
		System.out.println(" child block");
	}
	
	static 
	{
		System.out.println("from static block");
	}
	
	void MethodThree() {
		MethodFour();
		System.out.println("child block2");
		System.out.println(j);
	}
	
	InstanceFlowChild(){
		System.out.println("child constructor");
	}
	
	void MethodFour()
	{
		System.out.println("child block3");
		System.out.println(k);
	}
	
	int k=200;
	
	public static void main(String[] args) {
		
		InstanceFlowChild input=new InstanceFlowChild();
		input.MethodThree();
		input.Methodone();
       System.out.println("this is main method");
	}

}
