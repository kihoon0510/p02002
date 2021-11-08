package generics;

import java.util.ArrayList;

class Fruit implements Eatable {
	String name;
	int weight;

	public Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + "(" + weight + ")";
	}
}

class Apple extends Fruit {
	public Apple(String name, int weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public Grape(String name, int weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

interface Eatable {
}

enum Direction {
	EAST, SOUTH, WEST, NORTH
}

enum Cup {
	ICE(10), HOT(20);

	private final int value;

	// 열거형의 생성자는 외부에서 호출 불가능하다.
	Cup(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

enum Transportation {
	BUS(100) {
		@Override
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	TRAIN(150) {
		@Override
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	SHIP(100) {
		@Override
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	AIRPLANE(300) {
		@Override
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	};

	private Transportation(int basicFare) {
		this.BASIC_FARE = basicFare;
	}

	abstract int fare(int distance);

	protected final int BASIC_FARE;

	public int getBasicFare() {
		return BASIC_FARE;
	}
}

public class FruitBoxEx {

	public static void main(String[] args) {
		System.out.println(Cup.ICE.name());
		Cup[] cups = Cup.values();
		for (Cup c : cups) {
			System.out.printf("%s = %d \n", c.name(), c.ordinal());
		}

		Cup c = Cup.valueOf("ICE");
		System.out.println(c.name());
		System.out.println(c.getValue());

	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	ArrayList<T> getList() {
		return list;
	}

	public String toString() {
		return list.toString();
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {

}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		for (Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class Juice {

	String name;

	public Juice(String str) {
		this.name = str + " Juice.";
	}

	public String toString() {

		return name;
	}
}
