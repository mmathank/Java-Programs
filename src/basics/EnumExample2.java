package core.java.basics;

public class EnumExample2 {

	public static void main(String[] args) {

		ReturnCodes rc1 = ReturnCodes.SUCCESS;
		System.out.println(rc1);
		
		ReturnCodes rc2 = ReturnCodes.FAILURE;
		System.out.println(rc2);
		
		for (ReturnCodes rc : ReturnCodes.values()) {
			System.out.println(rc.getCode() + " : " + rc.getMessage());
		}
	}

}
