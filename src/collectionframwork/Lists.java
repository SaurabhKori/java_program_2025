package collectionframwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
 public static void main(String[] args) {
//	List a =new ArrayList<>();
//	a.add("A");
//	a.add("B");
//	a.add("C");
//	System.out.println(a);
//	a.add(2,"E");
//	System.out.println(a);
//	List b=new ArrayList<>();
//	b.add("K");
//	b.add("M");
//	a.addAll(b);
//	System.out.println(a);
//    System.err.println(	a.contains("B"));
//    System.out.println(a.containsAll(b));
//    a.forEach(c->System.out.println(c));

		List<Person> person = new ArrayList<Person>();
		person.add(new Person("Saurabh", 23, 93323232));
		person.add(new Person("Gaurav", 20, 93334343));
		person.add(new Person("Gaurav", 20, 93334343));
		person.add(new Person("Kisan", 16, 93423232));
		person.add(new Person("Raj", 23, 933423232));
		person.add(new Person("Vishal", 33, 9343232));

//		System.out.println(person);
//		Collections.sort(person);
//		System.out.println(person);
//		person.forEach(p -> System.out.println(p.hashCode()));
//		Collections.sort(person, Comparator.comparing(Person::getAge));
//		person.forEach(System.out::println);
//		person.stream().distinct().forEach(System.out::println);
		Person value = person.stream().filter(p -> p.getAge() == 23).findFirst().orElse(null);
		List<Person> filter = person.stream().filter(p -> p.getName().equals("Gaurav")).collect(Collectors.toList());
		filter.forEach(System.out::println);
		System.err.println(value);
		;

		
    
}
}
