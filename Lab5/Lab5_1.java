import java.util.*;
import java.lang.Math;

public class Lab5_1{
	int add(int x[], int n){
			int i;
			int sum=0;
			for(i=0;i<n;i++){
				sum+=x[i];
			}
			return sum;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of array: ");
		int n=sc.nextInt();
		System.out.print("Enter your array: ");
		int x[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			x[i]=sc.nextInt();

		Lab5_1 l=new Lab5_1();
		
		int sum=l.add(x,n);
		
		System.out.println("Sum="+sum);
	}
}