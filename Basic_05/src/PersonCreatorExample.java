import java.util.Scanner;

public class PersonCreatorExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Person myPerson = new Person();
		
		System.out.println("Dear user, what is your name: ");
		
		myPerson.name = scanner.nextLine();
		
		System.out.println("What is your age?");
		
		myPerson.age = scanner.nextDouble();
		
		System.out.println("What is your weight?");
		
		myPerson.weightKg = scanner.nextDouble();
		
		System.out.println("Hi, my name is " + myPerson.name 
				+ " I'm " + myPerson.age 
				+ " years old, and my weight is "
				+ myPerson.weightKg + " KG");

		scanner.close();
	}
}
