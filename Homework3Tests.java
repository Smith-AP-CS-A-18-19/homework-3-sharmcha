public class Homework3Tests {

	/* Tests to verify that your solutions work
	 * Do not submit your homework until this compiles and the words
	 * "All Pass" are printed
	 */
	public static void main(String[] args) {
		Homework3 hw3 = new Homework3(5, 10, 15);
		hw3.problem1();
	}

	public static void grade(Homework3 hw3) {
		int exitCode = 0;

		System.out.println("Pass 1");

		if (hw2.problem2().equals("HELLO, WORLD!")) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw2.problem3().equals("HelloWorld")) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (Homework1.problem4() != null) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (Homework1.problem5(new Rectangle(5, 10, 20, 30)) == 100) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
