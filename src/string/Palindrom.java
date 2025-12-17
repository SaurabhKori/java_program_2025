package string;

public class Palindrom {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.err.println(palindrome("Mams")));
		Thread t2 = new Thread(() -> System.err.println(isPalindrome("Mam")));
		t1.start();
		try {
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		String a="SaurabK";
//		String b="Saurabh";
//		System.out.println("first  "+ b);
//		System.err.println( "second  " +a.codePointAt(1));
//		System.err.println("Third  "+a.codePointBefore(1));
//		System.err.println(a.codePointCount(0,2));
//		int first = 0;
//	    int second=0;
//  
//	   for(int i=0;i<a.length();i++) {
//		   first =first+a.codePointAt(i);
//		   System.err.println(a.charAt(i)+" "+a.codePointAt(i));
//	   }
//	   for(int i=0;i<b.length();i++) {
//		   second =second+b.codePointAt(i);
//		   System.out.println(b.charAt(i)+" "+b.codePointAt(i));
//	   }
//	   System.out.println("Fourth  "+second);
//	   System.out.println("Fifth  "+first);
//	   System.err.println("Six  "+(first-second));
//////		a.
//		System.err.println("Final "+a.compareTo(b));
//	System.err.println(b.chars().allMatch(Character::isLetter));;
//	System.err.println(a.chars().anyMatch(Character::isLetter));
//	System.err.println(a.startsWith("Saurabh"));
//	System.err.println(a.intern());
//		 String str = " Hello Java World ";
//		System.out.println("Length: " + str.length());
//        System.out.println("Char at 1: " + str.charAt(1));
//        System.out.println("Substring: " + str.substring(7, 11));
//        System.out.println("Contains 'Java': " + str.contains("Java"));
//        System.out.println("Lowercase: " + str.toLowerCase());
//        System.out.println("Uppercase: " + str.toUpperCase());
//        System.out.println("Trimmed: '" + str.trim() + "'");
//        System.out.println("Replaced: " + str.replace("Java", "Python"));
//        System.out.println("Starts with ' Hello': " + str.startsWith(" Hello"));
//        System.out.println("Ends with 'World ': " + str.endsWith("World "));
//        System.out.println("Is Empty: " + str.isEmpty());
//        System.out.println("Index of 'Java': " + str.indexOf("Java"));
//        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));
//        System.err.println(str.replaceAll("a","c"));
//        System.err.println(str.regionMatches(1, "a", 0, 0));
//        String[] words = str.trim().split(" ");
//        System.out.println("Split words:");
//        for(String word : words) {
//            System.out.println(word);
//        }
// String str1 = "  Hello Java  ";
//        
//        System.out.println(str1.isBlank()); // Java 11
//        System.out.println(str1.strip());   // Java 11 - Unicode strip
//        System.out.println(str1.repeat(3)); // Java 11 - Repeats 3 times
//        
//        String multiLine = "Line1\nLine2\nLine3";
//        multiLine.lines().forEach(System.out::println);
//        String str2 = "apple,banana,orange";
//
//        List<String> fruits = str2.transform(s -> Arrays.asList(s.split(",")));
//
//        fruits.forEach(System.out::println);
//        System.err.println(String.valueOf(1));
//        
//	 System.out.println(str.chars().count());
//	 System.out.println(str.chars().reduce(0, (acc, ch) -> acc + ch));
//// str.chars().distinct().forEach(ch -> System.err.print((char) ch));
////	 str.chars().max().ifPresent(max-> System.err.println("Max char: " + (char) max));
//	 str.chars()
//     .map(a -> a )  // Double each ASCII value
//     .forEach(System.out::println);
	}

//Ist way 
	public synchronized static String palindrome(String a) {
	 String a1=a.toLowerCase();
	   int start=0;
	   int end=a1.length()-1;
	   while(start<end) {
		   if(a1.charAt(start)!=a1.charAt(end)) {
			   return "Not Palindrome";
		   }
		   start++;
		   end--;
	   }
	  return "Palindrome";
  }

//   II nd way
	public synchronized static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j)
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		return true;
	}
}
