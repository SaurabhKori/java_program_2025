package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNotRepeatingCharacter {
	public static void secondNotRepeatingCharacter(String data) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < data.toCharArray().length; i++)
			map.put(data.toCharArray()[i], map.getOrDefault(data.toCharArray()[i], 0) + 1);
		int second = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.err.println(entry.getKey() + "" + entry.getValue());
			if (entry.getValue() == 1) {
				if (second == 1) {
					System.out.println("Second Not Repeating Chatracter--->" + entry.getKey());
					break;
				}
				second = 1;
			}
		}
	}

	public static void main(String[] args) {
		secondNotRepeatingCharacter("ShivShankar");
	}
}
