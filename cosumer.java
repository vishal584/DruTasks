package assigmet;

import java.util.List;
import java.util.function.Consumer;

import assigmet.Person;
import assigmet.PersonRepository;

public class cosumer {

	
		
	 static Consumer<Person> c1 = (per) -> System.out.println(per);
	 static Consumer<Person> c2 = (per) -> System.out.println(per.getGender().toUpperCase());
	 static Consumer<Person> c3 = (per) -> { System.out.print("Salary with new year bonus:");
	 System.out.println(per.getSalary()+1000);};
	 
	 static List<Person> personlist = PersonRepository.getAllPersons();
	 
	 public static void main(String[] args) {
	 
		 printWithCondition();
	 }
	 
	 public static void printWithCondition() {
		 
		 personlist.forEach(per -> { c1.andThen(c2).accept(per);
		 
		c3.accept(per);
		 
	 });
	 

	}

}
