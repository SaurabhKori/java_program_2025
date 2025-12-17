package collectionframwork;

import java.util.Objects;

public class Person {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age, phone);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return age == person.age && phone == person.phone && Objects.equals(name, person.name);
	}

	public String name;
	public int age;
	public long phone;

	public Person() {

	}

	public Person(String name, int age, long phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return this.age - o.age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
