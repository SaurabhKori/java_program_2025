package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	public static List<String> list = List.of("ram", "shyam", "ghansyam", "car", "bike", "Aanand", "Anuj");
	public static List<Integer> list1 = List.of(1, 2, 12, 4, 3, 3, 4, 5);
	public static List<Integer> list2 = List.of(3, 7, 12, 4, 3, 8, 4, 9);
//	Convert a list of strings to uppercase using Stream API.
	public static void upperCase() {

		list.stream().map(String::toUpperCase).forEach(System.out::print);
	}

//	Convert a list of strings to lowercase using Stream API.	
	public static void lowerCase() {
		list.stream().map(String::toUpperCase).map(String::toLowerCase).forEach(System.out::println);
	}

//	Find the maximum and minimum value in a list using Stream API.

	public static void maxValuse() {
		System.out.println(list1.stream().max(Integer::compare).get());
		System.out.println(list1.stream().min(Integer::compare).get());
	}

//	Count how many strings in a list start with the letter 'A' using Stream API.
	public static void countString() {
		System.out.println(list.stream().filter(a -> a.startsWith("A")).count());
	}

//	Sort a list of numbers in descending order using Stream API.
	public static void descending() {
		list1.stream().sorted((a, b) -> a - b).forEach(System.out::println);
	}

//   Remove duplicate elements from a list using Stream API.

	public static void removeDuplicate() {
		list1.stream().distinct().forEach(System.out::println);
	}

//	Find the second highest number in a list using Stream API.
	public static void secondHigestNumber() {
		list1.stream().sorted((a, b) -> b - a).skip(1).findFirst().get();
	}

//	Convert a list of strings into a map where key = string, value = string length.
	public static void convertListIntoMap() {
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(n -> n, n -> n.length()));
		System.out.print(map);
	}

//	Group a list of strings by their first character using Stream API.
	public static void groupByFirstCharacter() {
		Map<Character, List<String>> group = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.print(group);
	}

//	Find the sum of all numbers in a list using Stream API.
	public static void sum() {
		System.out.println(list1.stream().mapToInt(n -> n).sum());
	}

//	Filter out string whose length is greater than 5.
	public static void findStringLengthGreaterThanFive() {
		list.stream().filter(n -> n.length() > 5).forEach(System.out::println);
	}

//	Merge two lists of integers using Stream API.
	public static void mergeToList() {
		Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
		List mergeList = Stream.of(list1, list2, list).flatMap(List::stream).collect(Collectors.toList());
		System.out.print(mergeList);

	}

//	Convert a list of objects to a list of one of their fields (e.g., List<Employee> → List<String> of names).
	public static void getEmpNameasList() {
		StreamApi obj = new StreamApi();
		List<Employee> emp = Arrays.asList(obj.new Employee(1, "Ram", 4500), obj.new Employee(1, "Syam", 600),
				obj.new Employee(1, "Amit", 500));
		List<String> names = emp.stream().map(n -> n.getName()).toList();
		System.out.print(names);

	}

//	Find the frequency of each element in a list using Stream API.
	public static void frequency() {
		Map<Integer, Long> freq = list1.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.print(freq);
	}

//	Return the first non-repeating element from a list using Stream API.
	public static void nonRepeating() {
		int ans = list1.stream().filter(n -> Collections.frequency(list1, n) == 1).findFirst().orElse(-1);
		System.err.print(ans);
	}
	public static void main(String[] args) {
//		upperCase();
//		lowerCase();
//		maxValuse();
//		countString();
//		descending();
//		removeDuplicate();
//		convertListIntoMap();
//		groupByFirstCharacter();
//		findStringLengthGreaterThanFive();
//		mergeToList();
//		getEmpNameasList();
//		frequency();
		nonRepeating();
	}

	public class Employee {
		int id;
		String name;
		double salary;

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return this.name;
		}

		public double getSalary() {
			return this.salary;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSalary(double sal) {
			this.salary = sal;
		}
	}
}
