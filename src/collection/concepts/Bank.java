package core.java.collection.concepts;

public class Bank {
	
	private Object t;
	
	public Object getT() {
		return t;
	}

	public void setT(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		Bank salaryAccount = new Bank();
		salaryAccount.setT(new Icici());
		System.out.println(salaryAccount.getT());
		
		Bank personalAccount = new Bank();
		personalAccount.setT(new Hdfc());
		System.out.println(personalAccount.getT());
		
		Bank businessAccount = new Bank();
		System.out.println(businessAccount.getT());
		
//		java.lang.ClassCastException: 
//		core.java.collection.concepts.Icici cannot be cast to core.java.collection.concepts.Hdfc
		Hdfc hdfc = (Hdfc) salaryAccount.getT();
		
	}
}
