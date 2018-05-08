package com.carpackage;

public class usedCar extends Car {

	private double mileage;

	public usedCar() {
		mileage = 0;
	}

	public usedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String toString() {
		return super.toString() + " (Used) " + mileage + " miles";
	}
	
	
}
