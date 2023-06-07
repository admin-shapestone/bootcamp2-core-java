package com.shapestone.oops.polymorphism;

public class MethodOverrideDriverProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverrideDerived derived = new MethodOverrideDerived();
		derived.m1(null);
		
		MethodOverrideBase base = new MethodOverrideBase();
		base.m1(null);
		
		MethodOverrideBase methodOverrideBase = new MethodOverrideDerived();
		methodOverrideBase.m1(null);
		
	}

}
