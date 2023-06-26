package com.shapestone.encapsulation;

public class EncapsulationExample2 {

	public static void main(String[] args) {
		class Name {

			private int age;

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
		}

		Name n1 = new Name();

		n1.setAge(25);

		System.out.println("The age of the person is: " + n1.getAge());
	}

}
