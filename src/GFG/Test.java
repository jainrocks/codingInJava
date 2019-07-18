package com.example.gfg;

/**
 * Program to demonstrate working of a class type object created by JVM to 
 * represent .class file in memory
 * @author NikhilJain
 *
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Provides classes and interfaces for obtaining reflective information about
 * classes and objects i.e info about fields, methods and constructors of loaded
 * classes
 */

public class Test {
	public static void main(String[] args) {
		Student s = new Student();

		// getting type of class object
		Class c = s.getClass(); // returns runtime class of object

		System.out.println(c);

		// getting all methods of student class
		// Returns an array containing Method objects reflecting all
		// the declared methods of the class or interface represented by this Class
		// object
		Method m[] = c.getDeclaredMethods();

		// printing each method
		for (Method method : m)
			System.out.println(method.getName());
		// getting all fields of student class
		// Returns an array of Field objects reflecting all the fields
		// declared by the class or interface represented by this Class object.
		Field f[] = c.getDeclaredFields();
		for (Field field : f)
			System.out.println(field.getName());

	}

}

//class which info is fetched above using its object.
class Student {
	private String name;
	private String contact_number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

}
