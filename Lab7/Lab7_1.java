import java.util.*;
import java.lang.Math;

class Account{
	    private String Account_type;
		private String Ac_Holder_name;
		private int Ac_no;
		private String Branch;
	
		void get_detail(){
			System.out.println("\n\nAccount Type: "+this.Account_type);
			System.out.println("Name: "+this.Ac_Holder_name);
			System.out.println("Account Number: "+this.Ac_no);
			System.out.println("Branch: "+this.Branch);
		}

		void set_details(){
			Scanner sc =  new Scanner(System.in);

			System.out.print("Enter Account Type: ");
			String at= sc.next();

			String d=sc.nextLine();

			System.out.print("Enter Name: ");
			String ac_name= sc.nextLine();

			System.out.print("Enter Account Number: ");
			int acno= sc.nextInt();

			System.out.print("Enter Branch: ");
			String branch= sc.next();
			sc.close();
			this.Account_type=at;
			this.Ac_Holder_name=ac_name;
			this.Ac_no=acno;
			this.Branch=branch;
		}

}

public class Lab7_1{
	public static void main(String[] args) {
		Account s = new Account();
		s.set_details();
		s.get_detail();

	}

}