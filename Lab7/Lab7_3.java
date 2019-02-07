import java.util.*;
import java.lang.Math;

class Outer{

	class Inner{
		 void sum(int n){
			int res=0;
			res+=n%10;
			res+=n/100;

			System.out.println("Sum of first and last digit: "+ res);
		}
	}
}

public class Lab7_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.sum(n);

	}

}