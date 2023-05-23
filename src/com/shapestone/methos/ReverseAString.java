package com.shapestone.methos;

public class ReverseAString {
	
	
	
	public void rev(String s) 
	{
		for(int i= s.length()-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) 
	{
		ReverseAString r = new ReverseAString();
		r.rev("Shape stone");

	}

}
