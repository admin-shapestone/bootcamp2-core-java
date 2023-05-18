package com.shapestone.AccessModifiers;

		public class Inharitance
		{
			public static  void main(String[] args)
		{
		 Cat c=new Cat();
			c.A();
			
		}	}
			 class Dog
			{
		    final void A() {
		    	 System.out.println("eats dogs");
		     } }
				
		  class Cat extends Dog
		  {
			  void B() {
				  System.out.println(" cat drins milk");
			  }
		  }


