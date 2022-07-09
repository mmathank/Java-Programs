package core.java.basics;

public class VarArgsExample {

	public static void showFavouriteColors(String... colors) {

		System.out.println("Inside method showFavouriteColors");
		for (String color : colors) {
			System.out.println(color);
		}
	}

	public static void main(String[] args) {

		showFavouriteColors();
		System.out.println();
		showFavouriteColors("Blue", "Green");
		System.out.println();
		showFavouriteColors("Blue", "Green", "White");
		System.out.println();
	}

}
