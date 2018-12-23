package lambdasolution.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lambdasolution.Person;

public class MainClass {
public static void main(String[] args) {
	List<Person> people = Arrays.asList(
			new Person("anupam","biswas",10),
			new Person("goutam","biswas",20),
			new Person("biswas","anupam",30));
	
	// sort list by last name
	
	//conventional way
	/*Collections.sort(people, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
		
	});*/
	
	//using lambda
	Collections.sort(people, (Person o1, Person o2)-> o1.getLastName().compareTo(o2.getLastName()));	
	// create a method that print all list
	//printAll(people);
	
	//or to print all another lambda can be, which will print all , cause we return true
	printStartLastNameBCondition(people, p-> true);
	
	//create a method that prints all person start with b
	//printStartLastNameB(people);
	
	//create a method that prints all person start with b generic conditionally
	//conventional way
	/*printStartLastNameBCondition(people, new Condition() {

		@Override
		public boolean test(Person p) {
			if(p.getLastName().startsWith("b")) {
				return true;
			}
			return false;
		}});*/
	
	//using lambda
	
	//printStartLastNameBCondition(people, (Person p)-> p.getLastName().startsWith("b"));
	//or
	printStartLastNameBCondition(people, p-> p.getLastName().startsWith("b"));
	
}

//better way to create interface and passing condition to make it generic, so this method does not
//care all the logic is implemented inside the interface
private static void printStartLastNameBCondition(List<Person> person, Condition condition) {
	for(Person p : person) {
		if(condition.test(p)) {
			System.out.println(p);
		}
		
	}
}

private static void printStartLastNameB(List<Person> person) {
	for(Person p : person) {
		if(p.getLastName().startsWith("b")) {
			System.out.println(p);
		}
		
	}
}
private static void printAll(List<Person> person) {
	for(Person p : person) {
		System.out.println(p);
	}
}

public interface Condition
{
	boolean test(Person p);
	}

}


