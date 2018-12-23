package functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lambdasolution.Person;

public class MainClass {
public static void main(String[] args) {
	List<Person> people = Arrays.asList(
			new Person("anupam","biswas",10),
			new Person("goutam","biswas",20),
			new Person("biswas","anupam",30));
	
	

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


//care all the logic is implemented inside the interface
private static void printStartLastNameBCondition(List<Person> person, Predicate<Person> condition) {
	for(Person p : person) {
		if(condition.test(p)) {
			System.out.println(p);
		}
		
	}
}

// The previous example using a functional interface named Condition 
// It can be replaced by newly Function class with predicate method 

}



