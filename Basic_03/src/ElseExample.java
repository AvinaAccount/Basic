import java.util.Scanner;

public class ElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dear user, please insert a two digit number:");
		int num = scanner.nextInt();

		if (num > 9 && num < 100) {
			int leftDigit = num / 10;
			int rightDigit = num % 10;

			if (leftDigit == rightDigit) {
				System.out.println("Equal!");
			} else {
				System.out.println("Not equal!");
			}
		} else {
			System.out.println("Input invalid! You must provide a two digit number!");
		}

		scanner.close();

	}

}
