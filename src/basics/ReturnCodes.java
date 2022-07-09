package core.java.basics;

public enum ReturnCodes {
	
	SUCCESS(0,"Success"), FAILURE(1,"Failure");
	
	int code;
	String message;
	
	private ReturnCodes(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
