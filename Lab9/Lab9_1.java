import java.util.*;
import java.lang.Math;

class Car{
	public void VehicleType(){
		System.out.println("This is Car! ");
	}

	public Car(){
		System.out.println("This vehicle is Car class conductor! ");	
	}
}

class Maruti extends Car{
	public void brand(){
		System.out.println("This is Maruti Car");
	}

	public Maruti(){
		System.out.println("Maruti Class Conductor! ");
	}
}

class Maruti800 extends Maruti{
	public void speed(){
		System.out.println("Speed: 120kmph");
	}

	public Maruti800(){
		System.out.println("This is Maruti800! ");
	}
}

public class Lab9_1 {
	public static void main(String[] args) {
		Maruti800 car =  new Maruti800();

		car.VehicleType();

		car.brand();

		car.speed();

	}
}

