import java.util.Scanner;
import java.lang.Math;

class Test{
	int a;
	String b;
}

class Lab3_2{
	public static void main(String args[]){
		Test t=new Test();
		printsn("Before Explicitly intializing instace variables");
		printsn("t.a= "+t.a);		
		printsn("t.b= "+t.b);
		t.a=15;
		t.b="Rajiv";

		Test t2=new Test();
		printsn("\nt2.a= "+t2.a);		
		printsn("t2.b= "+t2.b);	
		t2.a=14;
		t2.b="Jai";
		printsn("\n\nAfter Explicitly intializing instace variables");
		printsn("t.a= "+t.a);		
		printsn("t.b= "+t.b);		
	    printsn("\nt2.a= "+t2.a);		
		printsn("t2.b= "+t2.b);		
	}
	
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}

}