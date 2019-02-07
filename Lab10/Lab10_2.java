import java.util.*;
import java.lang.Math;

interface Inf1{
	int n = 5;
	void sum_of_n();
}

interface Inf2 extends Inf1{
	double pi = 3.14;
	void area_circle();

}

class Lab10_2 implements Inf2{

	public void sum_of_n(){
		System.out.println("Sum: " + ((n+1)*n/2)+"\n");
	}

	public void area_circle(){
		System.out.println("Area: "+(pi*n*n));
	}

	public static void main(String[] args) {
		Lab10_2 a = new Lab10_2();
		
		a.sum_of_n();
		a.area_circle();
	}

}