package com.Inheritance;

class Vehicle{
	
	public void start() {
		System.out.println("Vehicle Started");
	}
}

class MotorCycle extends Vehicle{
	@Override
	public void start() {
		super.start();
	System.out.println("Motorcycle started");
	}
}

class Car extends Vehicle{
	@Override
	public void start() {
		super.start();
		System.out.println("Car started");
	}
}

public class InheritanceVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.start();
		MotorCycle mc = new MotorCycle();
		mc.start();
	}

}
