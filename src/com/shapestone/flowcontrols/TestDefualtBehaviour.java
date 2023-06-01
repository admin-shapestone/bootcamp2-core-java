package com.shapestone.flowcontrols;

import com.shapestone.accessmodifiers.*;

import MethodsAndConstructors.MethodsAndConstructorsExample;
//import com.shapestone.accessmodifiers.DefaultCalssDemo;

public class TestDefualtBehaviour extends DefaultCalssDemo {

	final StringBuffer name = new StringBuffer("10");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefualtBehaviour behaviour = new TestDefualtBehaviour();
		behaviour.disyplay();
		behaviour.name.append("Nithish Rayapati");
//		name = new StringBuffer("Nithish Rayapati");
		System.out.println("Student name is :: " + behaviour.name);
		MethodsAndConstructorsExample example = new MethodsAndConstructorsExample();
	}
	
	/*
	 * @Override public void disyplay() { System.out.println(""); }
	 */

}
