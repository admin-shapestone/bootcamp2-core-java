package com.shapestone.wrapperclass;

public class ReferanceCamparision {

	public static void main(String[] args) {
		Integer I=Integer.valueOf("10");
		Integer I1=Integer.valueOf("10");
        System.out.println(I==I1); //true
        // two referances will pointing the one object so it is true
        
        Long L=new Long("10");
        Long L1=new Long("10");
       System.out.println(L==L1);//false
     // here we are creating two different objects  two referances will pointing the two different objects
	}

}
