package GFG;

enum City {
	Noida, Gurgaon, Delhi;
}

public class EnumExample {

	public static void main(String[] args) {

		City c = City.Gurgaon;
		System.out.println(c);

	}
}

class SwitchCase {

	City c1;

	public SwitchCase(City c1) {
		this.c1 = c1;
	}

	public void myCity() {

		switch (c1) {

		case Noida:
			System.out.println("congrats you are in noida");
		default:
			System.out.println("your bad luck");
		}
	}

	public static void main(String[] args) {

		String s = "Delhi";
		// valueOf() method returns the enum constant of the specified string value, if
		// exists.
		SwitchCase sw = new SwitchCase(City.valueOf(s));
		sw.myCity();

	}

}
