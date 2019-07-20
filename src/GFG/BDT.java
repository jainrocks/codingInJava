package com.example.gfg;

//example to demonstrate boolean data type and byte data type
//byte data type, an 8 bit signed two's complement integer, can have values from -128 to 127

public class BDT {

	public static void main(String[] args) {

		boolean a = false;
		if (a == false)
			System.out.println("Hey you are right");

		byte b = 126;

		System.out.println(b);

		b++;
		System.out.println(b);

		// here it print -128 since byte value overflows
		b++;
		System.out.println(b);

		// print -127, loops back within the range
		b++;
		System.out.println(b);
	}

}
