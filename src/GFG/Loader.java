package com.example.gfg;

//class loader, bootstrap class loader, a platform specific machine instructions that kick off the whole classloading process.

public class Loader {
	
	public static void main(String[] args) {
		
		System.out.println(String.class.getClassLoader());
//This print out null since Bootstrap class loader is not a java object		
		System.out.println(Loader.class.getClassLoader());
//This print out system class loader.		
	}
	
	

}
