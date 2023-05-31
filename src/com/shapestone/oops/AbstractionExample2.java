package com.shapestone.oops;

public abstract class AbstractionExample2 {

	abstract void shape();

	public static void main(String[] args) {

		Circle c = new Circle();
		c.shape();
		Rectangle r = new Rectangle();
		r.shape();
		Square s = new Square();

		s.shape();

	}
}

class Circle extends AbstractionExample2 {
	void shape() {
		System.out.println("draw circle");
	}
}

class Rectangle extends AbstractionExample2 {
	void shape() {
		System.out.println("draw rectangle");
	}
}

class Square extends AbstractionExample2 {
	void shape() {
		System.out.println("draw square");
	}
}
