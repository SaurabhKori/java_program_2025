package string;

//Check rotation of strings
public class RotationString {
	public static boolean isRotation(String s1, String s2) {
		return s1.length() == s2.length() && (s1 + s1).contains(s2);
	}

	public static boolean isRotation2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		int index = s1.indexOf(s2.charAt(0));
		while (index != -1) {
			String rotated = s1.substring(index) + s1.substring(0, index);
			if (rotated.equals(s2))
				return true;
			index = s1.indexOf(s2.charAt(0), index + 1);
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isRotation("abcd", "cdab"));
	}
}
