package java8feature;

public class Runnable1 {
	public static void main(String[] args) {
		Runnable runs = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Runable Interface" + i);
			}
		};
		Thread a = new Thread(runs);
		a.run();
	}

}
