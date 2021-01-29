import java.util.Scanner;

public class GradeExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert your grade: ");
		int grade = scanner.nextInt();
		// pipe line
		if (grade < 0 || grade > 100) {
			System.out.println("Invalid grade!");
		} else if (grade >= 90) {
			System.out.println("Excellent!");
		} else if (grade >= 70) {
			System.out.println("Very Good!");
		} else if (grade >= 60) {
			System.out.println("Good!");
		} else {
			System.out.println("Failed!");
		}

		scanner.close();
	}
}
