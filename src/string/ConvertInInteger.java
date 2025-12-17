package string;

//Convert string to integer
public class ConvertInInteger {
	public static Integer convertInInteger(String s) {
		try {
			Integer result = Integer.parseInt(s);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(convertInInteger("1r"));
	}
}
