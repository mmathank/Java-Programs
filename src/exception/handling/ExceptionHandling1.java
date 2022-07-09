package core.java.exception.handling;

public class ExceptionHandling1 {

	public static void calculate() {
		int a = 2;
		int total = 10;
		int c = total / a;
		
		String name = "";
		System.out.println(name.toLowerCase());
	}
	
	public static void showBanner() throws Exception {
		
//		throw new Exception();
		System.out.println("Showing Banner...");
	}
	

	public static void main(String[] args) {

		try {
			calculate();
		} catch (NullPointerException e) {
			System.out.println("Exception Handled: " + e);
//			return;
		} finally {
			System.out.println("Inside Finally Block!");
		}
		
		try {
			showBanner();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled.. Program completed successfully!");
	}

}
