import java.util.Scanner;
import java.lang.Math;

class Circle{
	public static void main(String args[]){
		float r=Float.parseFloat(args[0]);
		printsn("Circle");
		printsn("-----------");
		printsn("Radius: "+r);
		double p=3.14159;
		printsn("");
		printsn("Perimeter: "+(2*p*r));
		printsn("Area: "+(p*r*r));


	}
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}
}

class Square{
	
	public static void main(String args[]){
		float a=Float.parseFloat(args[0]);
		printsn("Square");
		printsn("-----------");
		printsn("Side: "+a);
		printsn("");
		printsn("Perimeter: "+(4*a));
		printsn("Area: "+(a*a));

	}
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}
}

class Triangle{
	
	public static void main(String args[]){
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		float c=Float.parseFloat(args[2]);
		printsn("Triangle");
		printsn("-----------");
		printsn("a: "+a);
		printsn("b: "+b);
		printsn("c: "+c);
		printsn("");
		printsn("Perimeter: "+(a+b+c));
		float s = (a+b+c)/2;
		float d=s*(s-a)*(s-b)*(s-c);
		double area=Math.sqrt(d);
		printsn("Area: "+area);

		
	}
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}
}

class Rectangle{
	public static void main(String args[]){
		float l=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		printsn("Rectangle");
		printsn("-----------");
		printsn("Length: "+l);
		printsn("Breadth: "+b);
		printsn("");
		printsn("Perimeter: "+(2*(l+b)));
		printsn("Area: "+(l*b));

	}
	
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}

}

class Lab3_2{
	public static void main(String args[]){
		
	}
}
