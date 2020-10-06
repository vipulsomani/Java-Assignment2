package stream;

import java.util.ArrayList;

public class ListOfIntegers {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; i += 3) {
			list.add(i);
		}
		
		System.out.println("Display all");
		list.stream().forEach(i -> System.out.println(i));

		System.out.println("Display all Even");
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		System.out.println("Display all Odd");
		list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);

		System.out.println(" Divisible by 6");
		list.stream().filter(i -> i % 6 == 0).forEach(System.out::println);

		System.out.println("Numbers less than 12");
		list.stream().filter(i -> i < 12).forEach(System.out::println);

		System.out.println("Numbers greaterd than 50");
		list.stream().filter(i -> i > 50).forEach(System.out::println);
	}

}
