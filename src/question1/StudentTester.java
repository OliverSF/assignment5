/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

import java.util.*; //importing all lists using *

public class StudentTester {
	//class name based on end goal

	public static void main(String[] args) {
		//main method for tester class
		
		List<Student> classroom = new ArrayList<Student>();
		//Creating Arraylist to hold collection of Student objects
		
		//creating 3 instances of the Student class & storing them in the Array list, testing constructor
		classroom.add(new Student());
		classroom.add(new Student());
		classroom.add(new Student());
		
		//testing all of the getter and setter methods.
		classroom.get(0).setName("Peter Murphy");
		classroom.get(0).setId(4123);
		classroom.get(0).setCourse("English");
		
		classroom.get(1).setName("Gail Winters");
		classroom.get(1).setId(2543);
		classroom.get(1).setCourse("French");
		
		classroom.get(2).setName("Mary McDonagh");
		classroom.get(2).setId(1532);
		classroom.get(2).setCourse("German");
		
		//using enhanced for loop to traverse the Array and toString method to print out results
		for(Student p : classroom){
			System.out.println(p.toString());
		}

	} //end main method

} //end class
