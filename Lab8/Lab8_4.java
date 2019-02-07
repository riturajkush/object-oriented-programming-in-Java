import java.util.*;

class Customer{
	int empid;
	String empname;
	public Customer(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee id: ");
		empid = sc.nextInt();
		System.out.print("Name: ");
		empname = sc.next();
	}
}

class Depositor extends Customer{
	int deposited_amount;
	public Depositor(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount Deposited: ");
		deposited_amount = sc.nextInt();	
	}
}

class Borrower extends Depositor{
	int loan_no;
	int loan_amount;

	public Borrower(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Loan Number: ");
		loan_no = sc.nextInt();	
		System.out.print("Loan Amount: ");
		loan_amount = sc.nextInt();
	}

	void display(){
		System.out.println();
		System.out.println();

		System.out.println("Emp ID: "+ empid);
		System.out.println("Name: "+empname);
		System.out.println("Bank Balance: "+deposited_amount);
		if(loan_amount!=0){
			System.out.println("Loan No: "+loan_no);
			System.out.println("Loan Amount: "+ loan_amount);
		}
		else{
			System.out.println("No Loan taken!");
		}
		System.out.println();
		System.out.println();

	}

}

public class Lab8_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Borrower b;
		int i;
		for (i=0;i<n ;i++ ) {
			b = new Borrower();
			b.display();
		}
		
	}
}