import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert the base:");
		int base = scanner.nextInt();
		System.out.println("Please insert the power:");
		int power = scanner.nextInt();

		int result = base;

		switch (power) {
		case 0:
			result = 1;
			break;
		case 1:
			result = base;
			break;
		case 2:
			result = base * base;
			break;
		case 3:
			result = base * base * base;
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}

		System.out.println("The result is: " + result);

		scanner.close();
	}

}
