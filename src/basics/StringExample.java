package core.java.basics;

public class StringExample {

	public static void main(String[] args) {

		String book = "Java Complete Reference";
		System.out.println("Book Name is: " + book);
		System.out.println(book.substring(0,4));
		System.out.println(book.toUpperCase());
		
		String name1 = "mathankumar";
		String name2 = "mathankumar";
		boolean result = name1 == name2;
		System.out.println("Name1 & Name2 refering same obj: " + result);
		System.out.println("Content Checking: " + name1.equals(name2));
		
		String lastName = ".M";
		System.out.println(name1.concat(lastName));
		
		String word = "   java   ";
		System.out.println(word);
		System.out.println(word.trim());
		
		String keyword = "SPRING FRAMEWORK";
		String keywordInLowerCase = keyword.toLowerCase();
		System.out.println(keyword);
		System.out.println(keywordInLowerCase);
		
		String subject1 = new String("Tamil");
		String subject2 = new String("Tamil");
		
//		checking both objects are referring to the same memory location
		if(subject1 == subject2) {
			System.out.println("Same Instance");
		} else {
			System.out.println("Not Same Instace");
		}
		
//		checking both objects are same by content
		if(subject1.equals(subject2)) {
			System.out.println("Two Strings are same");
		}
		
		String word1 = "JAVA";
		String word2 = "JAVA";
		if (word1 == word2) {
			System.out.println("Refering same literals in string pool");
		}
	}

}
