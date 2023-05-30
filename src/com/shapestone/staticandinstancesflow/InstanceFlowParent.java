package com.shapestone.staticandinstancesflow;

public class InstanceFlowParent {
	  int i=10;
	  {
		  
		  System.out.println(i);
		  System.out.println(" parent first block");
	  }
	
	InstanceFlowParent(){
		System.out.println(" parent costructor");
	}
	void Methodone()
	{
		Methodtwo();
		System.out.println(i);
		System.out.println("these is methodone ");
	}
		
	void Methodtwo()
	{
		System.out.println("thse is methodtwo");
	}
	
	

}
