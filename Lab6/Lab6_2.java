import java.util.*;
import java.lang.Math;

class ConsOver{
	public ConsOver(int a, int b){
		System.out.println("Sum of int: " + (a+b)+"\n");
	}

	public ConsOver(float a, float b){
		System.out.println("Sum of float: " + (a+b)+"\n");
	}

	public ConsOver(double a, double b){
		System.out.println("Sum of doubles: " + (a+b)+"\n");
	}

	public ConsOver(String a, String b){
		System.out.println("Concatenation of Strings: " + a+b+"\n");
	}
}

public class Lab6_2{
	public static void main(String[] args) {
		System.out.println("Enter choice to perform addition: \n");
		System.out.println("1. Int\n2. Float\n3. Double\n4. String\n");
		System.out.println("Choice: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter two values: ");
		switch(n){
			case 1:
			{
				int a=sc.nextInt();
				int b=sc.nextInt();

				ConsOver c=new ConsOver(a,b);
				break;
				
			}
			case 2:
			{
				float a=sc.nextFloat();
				float b=sc.nextFloat();

				ConsOver c=new ConsOver(a,b);
				break;
				
			}
			case 3:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();

				ConsOver c=new ConsOver(a,b);
				break;
				
			}
			case 4:
			{
				String a=sc.next();
				String b=sc.next();

				ConsOver c=new ConsOver(a,b);
				break;
				
			}

			default:
			{
				System.out.println("Invalid Option!");
				break;
			}

		}
	}
}