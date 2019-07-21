package GFG;

//class loader, bootstrap class loader, a platform specific machine instructions that kick off the whole classloading process.

public class Loader {
	
	public static void main(String[] args) {
		
		System.out.println(String.class.getClassLoader());
		
		System.out.println(Loader.class.getClassLoader());
	}
	
	

}
