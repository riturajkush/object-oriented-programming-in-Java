import java.util.*;

class Personal_employee{
	String name;
	String address;
	int working_hours;

}

class Employee extends Personal_employee{
	int salary;
	String designation;
	void set_salary(){
		salary = working_hours*8;
	}

	void assign_desg(String desg){
		designation = desg;
	}

	void display(){
		System.out.println();
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Address: "+ address);
		System.out.println("Working Hours: "+ working_hours);
		System.out.println("Salary: "+ salary);
		System.out.println();
		System.out.println();
	}	
}

public class Lab8_1{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Rajiv ";
		e.address = "Naya Raipur";
		e.working_hours = 30;
		e.assign_desg("Superidentent");
		e.set_salary();
		e.display();

	}
}