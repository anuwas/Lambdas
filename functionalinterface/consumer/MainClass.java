package functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
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
	
	// If I want to print in line then another function can be used , Implement the consumer interface
	// and override accept method
	printStartLastNameBCondition(people, p-> p.getLastName().startsWith("b"),p->System.out.println(p));
	//or can be calling the other method of the object inside system out print
	printStartLastNameBCondition(people, p-> p.getLastName().startsWith("b"),p->System.out.println(p.getFirstName()));
}


//care all the logic is implemented inside the interface
private static void printStartLastNameBCondition(List<Person> person, Predicate<Person> condition, Consumer<Person> consume) {
	for(Person p : person) {
		if(condition.test(p)) {
			consume.accept(p);		}
		
	}
}

}



