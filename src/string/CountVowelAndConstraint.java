package string;
//Count vowels and consonants

import java.util.HashMap;
import java.util.Map;

public class CountVowelAndConstraint {
// ISt way
	public static Map<String, Integer> countVowelAnConstriant(String data) {
		int c = 0, v = 0;
		for (char ch : data.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(ch) >= 0)
				v++;
			else
				c++;
		}
		Map<String, Integer> r = new HashMap();
		r.put("vowels", v);
		r.put("consonants", c);
		return r;
	}

	public static void main(String[] args) {
		System.out.println(countVowelAnConstriant("SaurabhKori"));
	}

}
