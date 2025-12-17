package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Count occurrences of each character hello df
public class CharCount {
// Ist way 
	public static Map<Character, Integer> charCount(String data) {
		List<Character> list = new ArrayList<>();
		for (char c : data.toCharArray())
			list.add(c);
		Set<Character> set = new HashSet();
		set.addAll(list);
		Map<Character, Integer> map = new HashMap<>();
		for (Character object : set) {
			int count = 0;
			for (Character object2 : list) {
				if (object == object2) {
					++count;
				}
			}
			map.put(object, count);
		}
		return map;
	}

	public static Map<Character, Integer> charCount1(String s) {
		Map<Character, Integer> m = new LinkedHashMap();
		for (char c : s.toCharArray())
			m.put(c, m.getOrDefault(c, 0) + 1);
		return m;
	}
	public static void main(String[] args) {
		System.out.println(charCount1("Saurabh"));
	}
}
