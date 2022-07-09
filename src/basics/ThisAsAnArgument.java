package core.java.basics;

class Base {

	ThisAsAnArgument cc;

	public Base(ThisAsAnArgument obj) {
		System.out.println("Value of Obj:" + obj);
	}
}

public class ThisAsAnArgument {

	int data = 100;

	public ThisAsAnArgument() {
		Base b1 = new Base(this);
		System.out.println("Constrctor of child class");
	}

	@Override
	public String toString() {
		return "ConstructorChaining [data=" + data + "]";
	}

	public static void main(String[] args) {

		ThisAsAnArgument temp = new ThisAsAnArgument();

	}

}
