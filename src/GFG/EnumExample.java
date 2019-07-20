package com.example.gfg;

enum City {
	Noida, Gurgaon, Delhi;
}

public class EnumExample {

	public static void main(String[] args) {

		City c = City.Gurgaon;
		System.out.println(c);

	}
}

class Switchcase {

	City c1;

	public Switchcase(City c1) {
		this.c1 = c1;
	}

	public void mycity() {

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
		Switchcase sw = new Switchcase(City.valueOf(s));
		sw.mycity();

	}

}
