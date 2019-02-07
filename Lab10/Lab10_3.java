import java.util.*;
import java.lang.Math;

interface Interface_1{
	default void display(){
		System.out.println("Interface1");
	}
}
interface Interface_2{
	default void display(){
		System.out.println("Interface2");
	}
}

class Lab10_3 implements Interface_1, Interface_2{
	public void display(){
		Interface_1.super.display();
		Interface_2.super.display();

	}

	public static void main(String[] args) {
		Lab10_3 a = new Lab10_3();
		a.display();
	}
}
