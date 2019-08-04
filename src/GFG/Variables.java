package GFG;

class Age {

	int SONage;
	int DAUGHTERage;
	int FATHERage;

	public void Local_Variable(){

		int age = 12;
		System.out.println("Student's age is: " + age);

	}
}

public class Variables {
	public static void main(String[] args) {

		Age A = new Age();
		A.Local_Variable();;

		// uncommenting below println will cause Exception since variable defined
		// locally
		// System.out.println("Student age is : " + age);
		
		StaticVariable.age = 12;
		//directly accessing static variable using class name 
		System.out.println(StaticVariable.age);

	}
}

class InstanceVariable {
	public static void main(String[] args) {
		
		
        //first object of instance
		Age B = new Age();
		B.SONage = 10;
		B.DAUGHTERage = 11;
		B.FATHERage = 35;
		
		//second object of intance variable
		Age C = new Age();
		C.SONage = 20;
		C.DAUGHTERage = 23;
		C.FATHERage = 48;
		
		//ages of first family
		System.out.println(B.DAUGHTERage);
		System.out.println(B.SONage);
		System.out.println(B.FATHERage);
		
	}
}


class StaticVariable{
	public static int age;
}



