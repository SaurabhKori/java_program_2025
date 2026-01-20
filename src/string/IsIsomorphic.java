package string;

import java.util.HashMap;

public class IsIsomorphic {


		public static boolean isIsomorphic(String s, String t) {
			// Agar length alag hai, to isomorphic nahi ho sakte
			if (s.length() != t.length()) {
				return false;
			}

			// Do maps mapping store karne ke liye
			HashMap<Character, Character> mapST = new HashMap<>();
			HashMap<Character, Character> mapTS = new HashMap<>();

			for (int i = 0; i < s.length(); i++) {
				char charS = s.charAt(i);
				char charT = t.charAt(i);

				// 1. Check mapping from S to T
				if (mapST.containsKey(charS)) {
					if (mapST.get(charS) != charT)
						return false;
				} else {
					mapST.put(charS, charT);
				}

				// 2. Check mapping from T to S (Reverse check)
				if (mapTS.containsKey(charT)) {
					if (mapTS.get(charT) != charS)
						return false;
				} else {
					mapTS.put(charT, charS);
				}
			}

			return true;
		}

		public static boolean isIsomorphic1(String s, String t) {
			if (s.length() != t.length())
				return false;
			int[] m1 = new int[256], m2 = new int[256];
			for (int i = 0; i < s.length(); i++) {
				if (m1[s.charAt(i)] != m2[t.charAt(i)])
					return false;
				m1[s.charAt(i)] = i + 1;
				m2[t.charAt(i)] = i + 1;
			}
			return true;
		}
		public static void main(String[] args) {
			System.out.println(isIsomorphic1("egg", "add")); // Output: true
			System.out.println(isIsomorphic("foo", "bar")); // Output: false
			System.out.println(isIsomorphic("paper", "title")); // Output: true
		}


}
