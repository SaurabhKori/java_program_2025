package string;

//Remove white spaces
public class RemoveWhiteSpace {
	public static String removeWhiteSpace(String s) {
		return s.replaceAll("\\s+", "");
	}

	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("Saurabh df sfe ds"));
	}
}
