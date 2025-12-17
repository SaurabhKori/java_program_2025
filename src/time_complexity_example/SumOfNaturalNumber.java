package time_complexity_example;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		long a = 999999999;
		double now = System.currentTimeMillis();
		findSum(a);
		System.out.println(System.currentTimeMillis() - now);
		now = System.currentTimeMillis();
		findSum1(a);
		System.out.println(System.currentTimeMillis() - now);

	}

	public static long findSum(long n) {
		return n * (n + 1) / 2;
	}

	public static long findSum1(long n) {
		long sum = 0;
		for (long i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
