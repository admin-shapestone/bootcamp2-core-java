package java_1_8_features;

interface Display {
	void show();
}

public class Lamda_Expresssion {

	public static void main(String[] args) {
		Display d = () -> {
			System.out.println("Lamda expression");
		};
		d.show();

	}
}
 