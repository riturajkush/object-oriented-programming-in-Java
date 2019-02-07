import java.util.*;
import java.lang.Math;

class Volume{
	public Volume(double a){
		System.out.println("Volume of Cube = " + (a*a*a));
	}
	public Volume(double h, double r){
		System.out.println("Volume of Cylinder = " + (3.14159*r*r*h));
	}
	public Volume(int i,double r){
		System.out.println("Volume of Sphere = " + ((4*3.14159*r*r*r)/3));
	}
}

public class Lab5_3{
	public static void main(String args[]){
		
		if(args[0].equals("Cube")){
			double a = Double.parseDouble(args[1]);
			Volume cube=new Volume(a);
		}
		if(args[0].equals("Cylinder")){
			double r = Double.parseDouble(args[1]);
			double h = Double.parseDouble(args[2]);
			Volume cube=new Volume(h,r);
		}
		if(args[0].equals("Sphere")){
			double r = Double.parseDouble(args[1]);
			Volume cube=new Volume(1,r);
		}
		
	}
}