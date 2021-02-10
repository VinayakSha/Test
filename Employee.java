package Test;

public class Employee {
private String firstName;
private String lastName;


public Employee(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName = lastName;
}

	@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee("Vivek","Bindra");
System.out.println(e1);
Employee e2=new Employee("Anil","Ambani");
System.out.println(e2);
	}

}
