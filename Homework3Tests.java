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

		if (hw3.problem2() == 30) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw3.problem3() == 10.0) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (hw3.problem4() == 720) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw3.problem5() == 350) {
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
