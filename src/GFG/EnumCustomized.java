package GFG;

enum BatteryStatus{
	
	RED("Low, Charge Now"), ORANGE("Half Charged"), GREEN("Full Charged");


	
	//setting variable for getting values
	private String status;
	
	public String getStatus(){
		
		return this.status;
	}
	
	private BatteryStatus(String status) {
		this.status = status;
	}
}
	
public class EnumCustomized {
	public static void main(String[] args) {
		
		BatteryStatus BS[] = BatteryStatus.values();
		for (BatteryStatus STATUS : BS)
			System.out.println("Name:" + STATUS.name() + " Status: " + STATUS.getStatus());
		
		
	}

	
}
	
	

