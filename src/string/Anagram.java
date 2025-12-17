package string;

import java.util.HashMap;
import java.util.Map;

//Check anagram strings
public class Anagram {
// Ist way
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;

		StringBuilder sb = new StringBuilder(b);

		for (char c : a.toCharArray()) {
			int index = sb.indexOf(String.valueOf(c));
			if (index == -1)
				return false;
			sb.deleteCharAt(index);
		}

		return true;
	}

//	IInd way
	public static boolean isAnagram1(String a, String b) {
		if (a.length() != b.length())
			return false;

		int[] count = new int[256];

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i) + "-" + count[a.charAt(i)] + "--" + count[a.charAt(i)]++);
			count[a.charAt(i)]++;
			count[b.charAt(i)]--;
		}

		for (int x : count)
			if (x != 0)
				return false;

		return true;
	}

	public static boolean isAnagramUnicode(String a, String b) {
		if (a.length() != b.length())
			return false;

		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < a.length(); i++) {
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);

			map.put(c1, map.getOrDefault(c1, 0) + 1);
			map.put(c2, map.getOrDefault(c2, 0) - 1);
		}

		for (int val : map.values())
			if (val != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagramUnicode("marll", "armym"));
	}
}
