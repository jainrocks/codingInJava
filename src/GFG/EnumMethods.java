package GFG;


enum Cities {
	Noida,
	Gurgaon,
	Delhi;
}

public class EnumMethods {
	
	public static void main(String[] args) {
		
		Cities c[] = Cities.values();
		
		for (Cities city : c)
			//using ordinal menthod to get index of each constants 
			System.out.println(city + " at index " + city.ordinal());
		
		System.out.println(Cities.valueOf("Delhi"));
		// below println causes IllegalArgumentException
		System.out.println(Cities.valueOf("NZM"));
	}

	
	
}
