package core.java.basics;

public class ConstructorChainingExample {
	
	String product;
	int price;
	
	public ConstructorChainingExample() {
		
		this("sample-product");
		System.out.println("Default-Constructor Invoked..");
	}
	
	public ConstructorChainingExample(String name) {
		
		this(100);
		product = name;
		System.out.println("Chained constructor with parameter String..");
		
	}
	
	public ConstructorChainingExample(int price) {
		this.price = price;
		System.out.println("Chained constructor with parameter int..");
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("{").append("\n")
				.append("Product Name: ").append(product)
				.append("\n").append("Its Price: ").append(price)
				.append("\n")
				.append("}");
		
		return builder.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(new ConstructorChainingExample());

	}

}
