
public class PersonExample {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();

		p.name = "Rany";
		p.age = 33;
		p.weightKg = 90;

		p2.name = "Adam";
		p2.age = 930;
		p2.weightKg = 70;

		System.out.println(
				"Hi, my name is " + p.name + " I'm " + p.age + " years old, and my weight is " + p.weightKg + " KG");
		System.out.println(
				"Hi, my name is " + p2.name + " I'm " + p2.age + " years old, and my weight is " + p2.weightKg + " KG");

	}

}
