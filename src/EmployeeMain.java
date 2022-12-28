/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Employee Class - Practice using classes, constructors, etc...
 */

//** Purpose: Practice designing, creating, and testing classes.
//** Goal:  Write a class that represents the attributes and behaviors of an Employee, and then write code that tests the functionality of the Employee class.

import java.util.Scanner;

public class EmployeeMain {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Program Start
				
		System.out.println("Employee Tester");
		
		System.out.print("\nEnter the employee's name: ");
		String Name = input.nextLine();
		
		System.out.print("\nEnter " + Name + "'s salary: ");
		double Salary = input.nextDouble();
		
		System.out.print("\nEnter a raise % from 0.0 to 1.0: ");
		double Raise = input.nextDouble();
		
		Employee e = new Employee(Name, Salary, Raise);
		
		System.out.println();
		System.out.println("Here is your employee:");
		System.out.println(e.toString());
		e.giveRaise(Raise);
		System.out.println("\nAfter giving " + e.getName() + " a " + e.getRaise() + "% raise, " + e.getName() + " now makes " + e.getSalary());
		
		input.nextLine();
		System.out.print("\nEnter a new name for the employee: ");
		Name = input.nextLine();
		e.setName(Name);
		
		System.out.print("\nEnter " + e.getName() + "'s new salary: ");
		Salary = input.nextDouble();
		e.setSalary(Salary);
		
		System.out.println("\nAfter changing the name and wage, the Employee now looks like this: ");
		System.out.println(e.toString());

		// Method End
	}
	// Program End
}
