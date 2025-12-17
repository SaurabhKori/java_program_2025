package string;

import java.util.HashSet;
import java.util.Set;

//Remove duplicate characters
public class RemoveDuplicateChar {
//	Ist way 
	public static String removeDuplicateChar(String data) {
		String result = "";
		for (char ch : data.toCharArray())
			if (result.indexOf(ch) >= 0)
				continue;
			else
				result += ch;
		return result;
	}

//second way 
	public static String removeDuplicateChar1(String data) {
		StringBuilder result = new StringBuilder();
		Set<Character> seen = new HashSet<>();
		for (char ch : data.toCharArray())
			if (seen.add(ch))
				result.append(ch);
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeDuplicateChar1("Saurabh"));
	}
}
