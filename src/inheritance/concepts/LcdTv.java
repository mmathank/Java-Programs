package core.java.inheritance.concepts;

public class LcdTv extends AbstractClassTV {

	String modelName;
	
	@Override
	public void repairScreen() {
		int basicCharges = serviceCharges();
		int total = 50 + basicCharges;
		System.out.println("Total Repair Cost for LCD TV: " + total);
	}
	
	@Override
	public int serviceCharges() {
		return 250;
	}
	
	@Override
	public String toString() {
		return "LcdTv [modelName=" + modelName + ", brandName=" + brandName + "]";
	}

	public static void main(String[] args) {
		
		LcdTv lcd = new LcdTv();
		lcd.brandName = "Samsung";
		lcd.modelName = "HDR-LCD";
		lcd.repairScreen();
		System.out.println(lcd);
	}

}
