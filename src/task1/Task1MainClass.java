package task1;

public class Task1MainClass {

	public static void main(String[] args) {
		Person person = new Person.BUILDER("Sergei", "Aidinov")
				.address("Направо второй поворот и прямо, пока не настанет рассвет").age(43).gender("Male")
				.country("Whole World").phone("123-45-67").middleName("Victorovich").build();

		System.out.println(person.toString());

	}

}
