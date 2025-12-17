package string;

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

	public static void main(String[] args) {
		System.out.println(highestOccurringChar("Saurabh"));
	}
}
