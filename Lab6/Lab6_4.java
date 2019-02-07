import java.util.*;
import java.lang.Math;

class Copy{
	public int a,b;

	public Copy(Copy c){
		this.a=c.a;
		this.b=c.b;
	}

	public Copy(int a, int b){
		this.a=a;
		this.b=b;
	}
}

public class Lab6_4{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		

		System.out.println("Enter a value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter a value of b: ");
		int b = sc.nextInt();
		Copy c = new Copy(a,b);
		System.out.println("c.a: "+ c.a +", c.b: "+ c.b);

		Copy d= new Copy(c);

		System.out.println("\n\nAfter copy constructor: ");

		System.out.println("d.a: "+ d.a +", d.b: "+ d.b);

	}
}