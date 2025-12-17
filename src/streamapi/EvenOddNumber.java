package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, print only the even numbers and Odd Number using
 * Stream API.
 */
public class EvenOddNumber {
	static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 21, 23, 25, 26);

	public static void main(String[] args) {
//		------Print Even Number---------
		list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
//		------Print Odd Number---------
		list.stream().filter(a -> a % 2 != 0).forEach(a -> {
			System.out.print(a + "  ");
		});
	}
}
