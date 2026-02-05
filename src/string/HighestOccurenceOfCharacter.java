package string;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the highest occurring character
public class HighestOccurenceOfCharacter {
	public static Character highestOccurringChar(String s) {
		int[] cnt = new int[256];
		for (char c : s.toCharArray())
			cnt[c]++;
		int max = 0;
		char ch = 0;
		for (int i = 0; i < cnt.length; i++)
			if (cnt[i] > max) {
				max = cnt[i];
				ch = (char) i;
			}
		return ch;
	}

	public static Character highestOccurrigChar1(String s) {
		Map<Character, Integer> maps = new LinkedHashMap<>();
		 for(Character ch:s.toCharArray())
			maps.put(ch, maps.getOrDefault(ch, 0) + 1);

		int max = 0;
		char result = 0;
		for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(highestOccurrigChar1("Saurabh"));
	}
}
