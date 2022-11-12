package task1;

import java.util.Objects;

public class Person {

	private String firstName;
	private String lastName;
	private String middleName;
	private String country;
	private String address;
	private String phone;
	private int age;
	private String gender;

	private Person(BUILDER builder) {
		this.firstName = builder.getFirstName();
		this.lastName = builder.getLastName();
		this.middleName = builder.getMiddleName();
		this.country = builder.getCountry();
		this.address = builder.getAddress();
		this.phone = builder.getPhone();
		this.age = builder.getAge();
		this.gender = builder.getGender();
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", country="
				+ country + ", address=" + address + ", phone=" + phone + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, country, firstName, gender, lastName, middleName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(country, other.country)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName)
				&& Objects.equals(phone, other.phone);
	}

	public static class BUILDER {

		private final String firstName;
		private final String lastName;
		private String middleName;
		private String country;
		private String address;
		private String phone;
		private int age;
		private String gender;

		public BUILDER(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public BUILDER middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public String getCountry() {
			return country;
		}

		public BUILDER country(String country) {
			this.country = country;
			return this;
		}

		public String getAddress() {
			return address;
		}

		public BUILDER address(String address) {
			this.address = address;
			return this;
		}

		public String getPhone() {
			return phone;
		}

		public BUILDER phone(String phone) {
			this.phone = phone;
			return this;
		}

		public int getAge() {
			return age;
		}

		public BUILDER age(int age) {
			this.age = age;
			return this;
		}

		public String getGender() {
			return gender;
		}

		public BUILDER gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

}
