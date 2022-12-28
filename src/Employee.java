/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Employee Class - Practice using classes, constructors, etc...
 */


public class Employee {
	// Attributes (Instance variables)
	private String EmployeeName;
	private double EmployeeSalary;
	private double EmployeeRaise;
	
	// Constructors
	public Employee(String aName, double aSalary, double aRaise) {
		EmployeeName = aName;
		EmployeeSalary = aSalary;
		EmployeeRaise = aRaise;
	}

	// Behaviors (Methods)
	@Override
	public String toString() {
		return ("name = " + EmployeeName + "\t" + "salary = " + EmployeeSalary);
	}
	
	public String getName() {
		return EmployeeName;
	}
	
	public double getSalary() {
		return EmployeeSalary;
	}
	
	public double getRaise() {
		return (EmployeeRaise * 100);
	}
	
	public void giveRaise(double aRaise) {
		EmployeeSalary += EmployeeSalary * aRaise;
	}
	
	public void setName(String aName) {
		EmployeeName = aName;
	}
	
	public void setSalary(double aSalary) {
		EmployeeSalary = aSalary;
	}
	
}
