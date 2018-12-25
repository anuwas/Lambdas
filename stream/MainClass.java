package stream;

import java.util.Arrays;
import java.util.List;

import lambdasolution.Person;

public class MainClass {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("anupam","biswas",10),
				new Person("goutam","biswas",20),
				new Person("biswas","anupam",30));
		
		people.stream()
		.filter(p->p.getFirstName().startsWith("a"))
		.forEach(p->System.out.println(p));
	}
}
