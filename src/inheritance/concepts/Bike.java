package core.java.inheritance.concepts;

public class Bike implements InterfaceVehicle {

	@Override
	public void driveRange() {
		System.out.println("Maximum KMs for a ride is: 50");

	}

	@Override
	public void occupantLimit() {
		System.out.println("Allowed persons to ride is: 2");
	}

	public static void main(String[] args) {

		Bike bike = new Bike();
		System.out.println("Speed Limit is: " + SPEED_LIMIT);
		bike.driveRange();
		bike.occupantLimit();
	}
}
