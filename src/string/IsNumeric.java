package string;

// 12 check contains only digits
public class IsNumeric {
	// first metod
	public static boolean isNumeric(String s) {
		return s.matches("\\d+");
	}

	public static boolean isNumeric1(String s) {
		try {
			Integer num = Integer.parseInt(s);
				return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
	public static void main(String[] args) {
		System.out.println(isNumeric1("1"));
	}
}
