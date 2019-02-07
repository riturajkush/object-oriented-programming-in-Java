import java.util.*;
import java.lang.Math;

class Outer{
	private int a;
	private String name;
	static{
		
		System.out.println("\nStatic block in Outer Class");
	}
	public Outer(){
		System.out.println("\nDefault Constructor of Outer Class. ");
	}
	void method1(){
		System.out.println("\nMethod in Outer Class!");
	}

	class Inner{

		void access(){
			a=10;
		    name="Rajiv";	
			System.out.println("\na from outer class: "+ a);
			System.out.println("\nname from outer class: "+ name);
		}

		

		public Inner(){
			System.out.println("\nDefault Constructor of Inner Class");
		 
		}

		void method2(){
			System.out.println("\nMethod in Inner Class!");
		}

	}

	static class Inner2{
		 static void factorial(int n){
			int i=1;
			int res=1;
			for(i=1;i<=n;i++)
				res=res*i;
			System.out.println("\nFactorial of "+n+" is: "+res);
		}
	}
}


public class Lab7_4{
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		out.method1();
		in.method2();
		in.access();

		Outer.Inner2.factorial(5);

		

	}

}