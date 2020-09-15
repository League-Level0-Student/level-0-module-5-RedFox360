package _01_algorithms._2_fibonacci;

public class Fibonacci {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int number1 = 1;
				int number2 = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(number1);
			System.out.println(number2);
			number1+=number2;
			number2+=number1;
		}
	}
}
