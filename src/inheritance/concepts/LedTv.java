package core.java.inheritance.concepts;

public class LedTv extends AbstractClassTV {

	String modelName;
	
	@Override
	public void repairScreen() {
		int basicCharges = serviceCharges();
		int total = 100 + basicCharges;
		System.out.println("Total Repair Cost for LED TV: " + total);
	}
	
	@Override
	public String toString() {
		return "LedTv [modelName=" + modelName + ", brandName=" + brandName + "]";
	}

	public static void main(String[] args) {
		
		LedTv led = new LedTv();
		led.brandName = "Sony";
		led.modelName = "BRAVIA";
		led.repairScreen();
		System.out.println(led);
	}
}
