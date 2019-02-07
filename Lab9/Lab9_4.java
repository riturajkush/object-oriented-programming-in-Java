import java.io.*;
import java.util.Scanner;

abstract class Shape{

	int l;
	int b;
	int r;
	String s;
	public void moveTo(int a, int b){
		System.out.println(a + " " + b + " "+s);
	}

	abstract void area();

	public Shape(String s , int l , int b){
		this.s = s;
		this.l = l;
		this.b = b;
	}

	public Shape(String s , int r){
		this.s = s;
		this.r = r;
	}

}

class Circle extends Shape{

	void area(){
		System.out.println("Area of Circle: " + (3.14 *r*r));
	}

	public Circle(int r){
		super("Circle", r);
	}
}

class Rectangle extends Shape{
	public Rectangle(int l,int b){
		super("Rectangle", l,b);
	}

	void area(){
		System.out.println("Area of Rectangle: " + (l*b));
	}
}

public class Lab9_4{
	public static void main(String[] args) {
		Circle c = new Circle(1);
		c.area();
		c.moveTo(1,2);

		Rectangle d = new Rectangle(10,12);
		d.area();
		d.moveTo(1,2);
	}
}