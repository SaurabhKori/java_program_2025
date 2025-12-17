package string;

//Reverse a string
public class ReverseString {
//	Ist
	public static String reverse(String data) {
		String reverse = "";
		for (int i = data.length() - 1; i >= 0; i--) {
			reverse += data.charAt(i);
		}
		return reverse;
	}

//IInd
	public static String reverse1(String data) {
		return new StringBuilder(data).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("Saurabh"));
		System.out.println(reverse1("Saurabh"));
	}
}
