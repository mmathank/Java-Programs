package core.java.inheritance.concepts;

public class HasARelationshipExample {

	public static void main(String[] args) {

		Car carObj = new Car();
		carObj.setCarName("MS-Swift");
		carObj.setModelYear(2021);
		
		Engine engine = new Engine();
		engine.setName("Next Gen K-series");
		engine.setType("Petrol");
		
		carObj.setEngine(engine);
		
		System.out.println(carObj);
		int mileage = carObj.getEngine().showMilege();
		System.out.println("Mileage per Litre: " + mileage);
	}

}
