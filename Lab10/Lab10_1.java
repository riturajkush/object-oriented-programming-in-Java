import java.util.*;
import java.lang.Math;

interface Inter_one{
	int x =10;
	abstract void display();
}

interface Inter_two{
	int x = 50;
	abstract void display();
}

class Lab10_1 implements Inter_one, Inter_two{

	public void display(){
		System.out.println("Inter_One: " + Inter_one.x + "\n");
		System.out.println("Inter_Two: " + Inter_two.x + "\n");
	}

	public static void main(String[] args) {
		Lab10_1 a = new Lab10_1();
		a.display();
	}
}