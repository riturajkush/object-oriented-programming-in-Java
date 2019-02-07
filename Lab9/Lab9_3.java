import java.io.*;
import java.util.Scanner;


abstract class Vehicle{

	abstract void no_wheels();

}

class Bike extends Vehicle{

	void no_wheels(){
		System.out.println("A Bike has 2 wheels");
	}
}


class Car extends Vehicle{

	void no_wheels(){
		System.out.println("A Car has 4 wheels");
	}

}


class Bus extends Vehicle{

	void no_wheels()
	{
		System.out.println("A Bus Has 6 wheels");
	}
}
public class Lab9_3{

	public static void main(String []args) {
		Bike bike = new Bike();
		Car car = new Car();
		Bus bus = new Bus();
		bike.no_wheels();
		car.no_wheels();
		bus.no_wheels();
	}

}