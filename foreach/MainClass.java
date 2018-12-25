package foreach;

import java.util.Arrays;
import java.util.List;

import lambdasolution.Person;

public class MainClass {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("anupam","biswas",10),
				new Person("goutam","biswas",20),
				new Person("biswas","anupam",30));
		
		//1. way for loop
		for(int i =0; i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		//2. way to foreach loop
		for(Person p : people) {
			System.out.println(p);
		}
		
		//3. java8 for each with lambda and this is internal iteration and rest of the are external
		
		people.forEach(p->System.out.println(p));
		//or
		people.forEach(System.out::println);
	}
	
	
}
