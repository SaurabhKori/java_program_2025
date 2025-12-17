package string;

import java.util.HashMap;
import java.util.Map;

//Count words in a string
public class CountWords {
	public static Map<String, Long> countWords(String str) {
		Map<String, Long> result = new HashMap<>();
		if (str == null || str.trim().isEmpty()) {
			result.put("Total Word", 0L);
			return result;
		}
		String[] s = str.split("\\s+");
		result.put("Total Word", Long.valueOf(s.length));
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countWords(""));
	}
}
