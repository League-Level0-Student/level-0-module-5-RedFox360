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
		nested2();
		nested3();
		nested4();
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
		for (int i = 1; i <= 7; i += 3) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print("" + j + " ");
			}
			System.out.println();
		}

		/*
		 * 1 2 3 4 5 6 7 8 9
		 */
	}

	public static void nested3() {
		for (int i = 1; i <= 91; i += 10) {
			for (int j = i; j <= i + 9; j++) {
				System.out.print("" + j + " ");
			}
			System.out.println();
		}
	}

	public static void nested4() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
}
	}

}
