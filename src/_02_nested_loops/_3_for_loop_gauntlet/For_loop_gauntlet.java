package _02_nested_loops._3_for_loop_gauntlet;

public class For_loop_gauntlet {

	public static void main(String[] args) {
		onetoonehundred();
		onehundredtoone();
		evens();
		evensandoddslabeled();
		sevens();
		yearsalive();
		nested1();
	}

	public static void onetoonehundred() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println(100);
	}

	public static void onehundredtoone() {
		for (int j = 100; j > 0; j--) {
			System.out.println(j);
		}
	}

	public static void evens() {
		for (int i = 2; i < 100; i += 2) {
			System.out.println(i);
		}
		System.out.println(100);
	}

	public static void evensandoddslabeled() {
		for (int i = 0; i < 500; i++) {
			if (i % 2 == 0) {
				System.out.println("" + i + " is even");
			}
			if (i % 2 == 1) {
				System.out.println("" + i + " is odd");
			}
		}
		System.out.println("500 is even");
	}

	public static void sevens() {
		for (int i = 7; i < 777; i += 7) {
			System.out.println(i);
		}
		System.out.println(777);
	}

	public static void yearsalive() {
		for (int i = 2010; i < 2020; i++) {
			int yearsold = i - 2010;
			System.out.println("In " + i + ", I was " + yearsold + " years old");
		}
		System.out.println("In 2020, I was 10 years old.");

	}

	public static void nested1() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("" + i + "	" + j + "");

			}
		}
	}

	public static void nested2() {
		
	}

}
