package com.shapestone.constructors;

public class ConstructorOverloading {
	int i;
	int j;
	int k;
	ConstructorOverloading(int a,int b)
	{
		i =a;
		j =b;
	}
	ConstructorOverloading(int a,int b,int c)
	{
		i = a;
		j = b;
		k = c;
	}
	void display() {
		System.out.println(i+ " "+j+" "+k);
	}
	public static void main(String[] args) {
		 ConstructorOverloading s1 = new  ConstructorOverloading(10,11);
		 ConstructorOverloading s2 = new  ConstructorOverloading(10,11,12);
		 s1.display();
		 s2.display();
	}

}