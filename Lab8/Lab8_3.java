import java.util.*;

class Grocery{
	int no_items;
	int cost;
	public Grocery(){
		Scanner sc = new Scanner(System.in);

		System.out.print("No. of items to purchase: ");
		no_items = sc.nextInt();
		System.out.print("Cost of each item: ");
		cost = sc.nextInt();

	}
}

class Discount extends Grocery{
	int total_bill;
	float rate;
	public Discount(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Discount rate(%): ");
		rate = sc.nextFloat();
		total_bill = cost * no_items;
		total_bill -= total_bill*(rate/100);

		if(total_bill>1000){
			total_bill -= total_bill*(rate/100);
		}
	}

	void final_bill(){
		System.out.println("Total Bill: "+total_bill);
	}
}


public class Lab8_3{
	public static void main(String[] args) {
		
		Discount d = new Discount();
		d.final_bill();
	}
}