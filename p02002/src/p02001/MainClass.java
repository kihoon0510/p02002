package p02001;

class OldObj {

}

class NewObj extends OldObj {

}

public class MainClass {

	public static void main(String[] args) {

		System.out.println(10.0 / 0.000);
	}
}

class Data {
	static int y;
	int x;

	static int sum(int x, int y) {
		int result = x + y;
		return result;
	}

	static {
		y = 33;
	}
	{
		x = 10;
		y = 20;
	}

	int sum() {
		int result = 10;
		return result;
	}

	public Data() {
		x = 10;
		y = 20;
		System.out.println("x: " + x + " y: " + y);
	}
}
