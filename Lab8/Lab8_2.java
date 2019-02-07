import java.util.*;

class Employee{
	int empid;
	String designation;
	int salary;
	String shift;
	void display(){
		System.out.println();
		System.out.println();
		System.out.println("Name: " + empid);
		System.out.println("designation: " + designation);
		System.out.println("Salary: "+salary);
		System.out.println("Shift: " + shift);
		System.out.println();
		System.out.println();
	}
}

class Hospital extends Employee{
	public Hospital(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("For Hospital\n===============");
		System.out.println("empid: ");
		int n = sc.nextInt();
		empid = n;
		System.out.println("designation: ");
		designation = sc.next();
		System.out.println("Salary: " );
		salary = sc.nextInt();
		System.out.println("Shift: ");
		shift = sc.next();
	}
}

class College extends Employee{
	public College(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("For College\n===============");
		System.out.println("empid: ");
		int n = sc.nextInt();
		empid = n;
		System.out.println("designation: ");
		designation = sc.next();
		System.out.println("Salary: ");
		salary = sc.nextInt();
		System.out.println("Shift: " );
		shift = sc.next();
	}
}

class Bank extends Employee{
	public Bank(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("For Bank\n===============");
		System.out.println("empid: ");
		int n = sc.nextInt();
		empid = n;
		System.out.println("designation: ");
		String d = sc.next();
		designation =d;
		System.out.println("Salary: ");
		int s = sc.nextInt();
		salary =s;
		System.out.println("Shift: ");
		d = sc.next();
		shift = d;
	}
}



public class Lab8_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Hospital\n2. College\n3. Bank\n\nChoice: " );
		int n = sc.nextInt();
		switch(n){
			case 1:
				Hospital h = new Hospital();
		        h.display();
				break;
			case 2:
				College c = new College();
		        c.display();
				break;
			case 3:
				Bank b = new Bank();
				b.display();
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
		}
		

	}
}