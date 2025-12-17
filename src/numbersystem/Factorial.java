package numbersystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Factorial {
	public static int factorial(int number) {
		if (number == 0 || number == 1)
			return 1;
		int fact = 1;
		while (number > 0) {
			fact *= number;
			--number;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println("Factorial ------   " + factorial(number));
		List<Integer> list = List.of(1, 2, 3, 4, 1, 2);

		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		String[] test = { "Apple", "Banana", "Orange", "Apple", "Banana" };
		List<String> s = Arrays.stream(test).map(data -> new StringBuilder(data).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(s);
		Collections.reverse(s);
		System.out.println(s);
	}
}
