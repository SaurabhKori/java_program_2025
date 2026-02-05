package string;

public class LexSubstring {
	// 20 lexicographically smallest/largest substring of given length k
	public static String lexSubstring(String s, int k, boolean smallest) {
		if (k <= 0 || k > s.length())
			return "";
		String res = s.substring(0, k);
		for (int i = 1; i <= s.length() - k; i++) {
			String cur = s.substring(i, i + k);
			if (smallest ? cur.compareTo(res) < 0 : cur.compareTo(res) > 0)
				res = cur;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(lexSubstring("welcometojava", 3, true));
	}
}
