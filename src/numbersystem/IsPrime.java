package numbersystem;

import java.util.Scanner;

public class IsPrime {
	public static String isPrime() {
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter Number");
		int number = scan.nextInt();
		int count = 0;
		for (int i = 0; i <= number / 2; i++) {
			if (number % 2 == 0) {
				count++;
			}
		}
		return count == 0 ? "Prime Number" : "Not Prime Number";

	}


	public static void main(String[] args) {

		System.out.println(isPrime());
	}
}
