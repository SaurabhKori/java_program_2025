package string;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the first non-repeating character
public class FirstNotRepeatingCharacter {
//
	public static String firstNotRepeatingCharacter(String data) {
		Map<Character, Integer> m = new LinkedHashMap();
		for (char c : data.toCharArray())
			m.put(c, m.getOrDefault(c, 0) + 1);
		for (Map.Entry<Character, Integer> entry : m.entrySet())
			if (entry.getValue() == 1)
				return entry.getKey().toString();
		return null;
	}

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingCharacter("sasaddssdsr"));
	}
}
