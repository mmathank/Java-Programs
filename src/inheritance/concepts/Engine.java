package core.java.inheritance.concepts;

public class Engine {

	String name;
	String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int showMilege() {
		if (type.equals("Diesel"))
			return 24;
		else
			return 20;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + "]";
	}
}
