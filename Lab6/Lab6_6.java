import java.util.*;
import java.lang.Math;

class India{

	final String country_name = "India"; 
	public void capital(){
		System.out.println("New Delhi!");
	}

}

class Central_India extends India{

	public void capital(){
		System.out.println("Nagpur! ");
		super.capital();
	}

}
class Chattisgarh extends Central_India{

	public void capital(){
		System.out.println("Raipur! ");
		super.capital();
		System.out.println(country_name);
	}

}

public class Lab6_6{
	public static void main(String[] args) {
		
		Chattisgarh c= new Chattisgarh();
		c.capital();

	}
}