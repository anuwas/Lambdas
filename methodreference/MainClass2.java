package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdasolution.Person;

public class MainClass2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("anupam","biswas",10),
				new Person("goutam","biswas",20),
				new Person("biswas","anupam",30));
		
		

		
		//printStartLastNameBCondition(people, p-> p.getLastName().startsWith("b"),p->System.out.println(p));
		// The above lambda can be written as 
		printStartLastNameBCondition(people, p-> p.getLastName().startsWith("b"),System.out::println);
		
		// So if the same reference return like p->System.out.println(p) , then it can be short hand writing
	}


	//care all the logic is implemented inside the interface
	private static void printStartLastNameBCondition(List<Person> person, Predicate<Person> condition, Consumer<Person> consume) {
		for(Person p : person) {
			if(condition.test(p)) {
				consume.accept(p);		
				}
			
		}
	}
	}
