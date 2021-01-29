import java.util.Scanner;

public class ElseIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dear user, please give me your age: ");
		int age = scanner.nextInt();

		if (age <= 18) {
			System.out.println("You are young!");
		} else if (age <= 64) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("You are old!");
		}

		scanner.close();
	}
}
