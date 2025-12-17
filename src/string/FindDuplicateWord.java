package string;
//Find duplicate words

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateWord {
//	first way 
	public static List<String> duplicateWord(String s) {
		String[] str = s.split("\\s+");
		Set<String> add = new HashSet<>();
		List<String> duplicate = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			if (add.add(str[i]))
				continue;
			duplicate.add(str[i]);

		}

		return duplicate;
	}

	public static Map<String, Integer> duplicateWords(String s) {
		String[] words = s.split("\\s+");
		Map<String, Integer> m = new HashMap();
		for (String w : words)
			m.put(w, m.getOrDefault(w, 0) + 1);
		return m.entrySet().stream().filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	public static void main(String[] args) {
		System.out.println(duplicateWords("and data and saurabh Kori saurabh"));
	}

}
