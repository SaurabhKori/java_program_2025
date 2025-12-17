package string;

import java.util.Arrays;
import java.util.stream.Collectors;

//Reverse each word in a string
public class ReverseEachWord {
//	Ist way
	public static String reverseEachWord(String data) {
		String reverse = "";
		String split[] = data.split(" ");
//		for (int i = split.length - 1; i >= 0; i--) {
//			reverse += split[i] + " ";
//		}
		for (int i = 0; i < split.length; i++) {
			reverse += new StringBuilder(split[i]).reverse().toString() + " ";
		}
		return reverse;
	}

	public static String reverseEachWord1(String data) {
		return Arrays.stream(data.split(" ", -1)).map(w -> new StringBuilder(w).reverse().toString())
				.collect(Collectors.joining(" "));

	}
	public static void main(String[] args) {
		System.out.println(reverseEachWord("Hello Dear How are you"));
		System.out.println(reverseEachWord1("Hello Dear How are you"));
	}
}
