package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;


	int run() {
		gasoline = gasoline-1;
		if (gasoline > 0) {
			int run = new java.util.Random().nextInt(15) + 1;

			return run;
		} else {
			return -1;
		}

	}

}
