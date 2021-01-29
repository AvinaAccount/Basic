import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the best Coffee Machine!");
		System.out.println("Please choose your drink [1-6]:");

		int selection = scanner.nextInt();

		switch (selection) {
		case 1:
			System.out.println("There you go: Black Coffee!");
			break;
		case 2:
			System.out.println("There you go: Espresso!");
			break;
		case 3:
			System.out.println("There you go: Macchiato!");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Sold out!");
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}

		scanner.close();
	}
}
