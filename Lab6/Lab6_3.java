import java.util.*;
import java.lang.Math;

class This{
	public int a;
	public This(int a){
		System.out.println("Instance variable using this keyword: "+ this.a);
		System.out.println("Local variable: "+ a);
		this.a=a;
		System.out.println("Changed value of instance Variable: "+ this.a);
		
	}
}

public class Lab6_3{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		This c=new This(n);
	}
}