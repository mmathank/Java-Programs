package core.java.collection.concepts;

public class GenericBank<T> {
	
	private T bank;
	
	public T getBank() {
		return bank;
	}

	public void setBank(T bank) {
		this.bank = bank;
	}


	public static void main(String[] args) {
		
		GenericBank<Icici> salaryAccount = new GenericBank<>();
		salaryAccount.setBank(new Icici());
		System.out.println(salaryAccount.getBank());
		
		GenericBank<Hdfc> personalAccount = new GenericBank<>();
		personalAccount.setBank(new Hdfc());
		System.out.println(personalAccount.getBank());
		
//		Stronger Type Checks at compile time
//		Hdfc hdfc = (Hdfc) salaryAccount.getBank();
	}
}