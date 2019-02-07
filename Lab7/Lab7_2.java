import java.util.*;
import java.lang.Math;

class Outer{

	static class Inner{
		 static void factorial(int n){
			int i=1;
			int res=1;
			for(i=1;i<=n;i++)
				res=res*i;
			System.out.println("Factorial of "+n+" is: "+res);
		}
	}
}

public class Lab7_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		Outer.Inner.factorial(n);

	}

}