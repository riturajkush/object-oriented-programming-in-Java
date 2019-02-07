import java.util.*;
import java.math.*;

class A{
	int a;
	public void increment(){
		this.a++;
	}
	public A(int n){
		this.a=n;
	}
	public void display(){
		System.out.print(a + ", ");
	}
}

class B extends A{
	int a;
	public void increment(){
		this.a++;
		super.increment();
	}
	public B(int n1, int n2){
		super(n1);
		this.a=n2;
	}

	public void display(){
		super.display();
		System.out.print(a + ", ");
		

	}
}

class C extends B{
	int a;
	public void increment(){
		this.a++;
		super.increment();
	}
	public C(int n1, int n2, int n3){
		super(n1,n2);
		this.a=n3;
		
	}
	public void display(){
		super.display();
		System.out.print(a + ", ");
		
	}
}

public class Lab9_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Incremented Ouput");
		C cc = new C(a,b,c);
		cc.increment();
		cc.display();
	}
}