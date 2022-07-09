package core.java.inheritance.concepts;

public class Car {

	String carName;
	int modelYear;
	Engine engine;
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", modelYear=" + modelYear + ", engine=" + engine + "]";
	}
	
	
}
