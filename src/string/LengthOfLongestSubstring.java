package string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap();

		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);

			if (map.containsKey(c) && map.get(c) >= start) {
				// move start to the next position of last occurrence
				start = map.get(c) + 1;
			}

			map.put(c, end);
			maxLen = Math.max(maxLen, end - start + 1);
		}

		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("Saurabhahakarddskl"));
	}
}
