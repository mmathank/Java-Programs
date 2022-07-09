package core.java.inheritance.concepts;

public class NewCar implements InterfaceVehicle {

	@Override
	public void driveRange() {
		System.out.println("Maximum KMs for a ride is: 500");

	}

	@Override
	public void occupantLimit() {
		System.out.println("Allowed persons to ride is: 5");
	}

	public static void main(String[] args) {

		NewCar car = new NewCar();
		System.out.println("Speed Limit is: " + SPEED_LIMIT);
		car.driveRange();
		car.occupantLimit();
	}

}
