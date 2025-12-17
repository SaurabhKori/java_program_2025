package string;
//Reverse string using recursion
public class ReverseRecursion {
	public static String reverseRec(String s) {
		if (s.isEmpty())
			return s;
		return reverseRec(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverseRec("Saurabh"));
	}
}
