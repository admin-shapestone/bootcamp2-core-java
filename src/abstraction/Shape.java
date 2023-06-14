package abstraction;

public abstract class Shape {

	abstract void draw();

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("draw recatngle");
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("draw circle");
	}
}
