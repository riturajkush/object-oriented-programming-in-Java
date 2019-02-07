import java.util.*;
import java.lang.Math;

class Class_car{

	static String brand;

	static{
		brand="Volkswagon";
	}
	static void new_brand(String s){
		brand=s;

	}

}

public class Lab6_5{
	public static void main(String[] args) {
		Class_car c =new Class_car();
		System.out.println(c.brand);
		Class_car d =new Class_car();
		System.out.println(d.brand);
		Class_car e =new Class_car();
		System.out.println(e.brand);

		Class_car f =new Class_car();
		f.new_brand("WagonR");

		System.out.println(c.brand);
		System.out.println(d.brand);
		System.out.println(e.brand);
		

	}
}