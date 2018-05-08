package com.carpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> arr = new ArrayList<>();
		
		arr.add(new Car("Ford", "Escape", 2018, 29999.99));
		arr.add(new Car("Ford", "Explorer", 2019, 49999.99));
		arr.add(new Car("Nissan", "Rogue", 2018, 19999.99));
		arr.add(new Car("Dodge", "Ram", 2019, 79999.99));
		arr.add(new usedCar("Chevy", "Equinox", 2013, 17200.00, 35000));
		arr.add(new usedCar("Ford", "Fiesta", 2000, 0.99, 200000));
		arr.add(new usedCar("Ford", "Model T", 1957, 2999999.99, 496500.7));
		String ans = "y";
		String y = "y";
		
		while (y.equalsIgnoreCase("y")) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println((i + 1) + "- " + arr.get(i));
				if (i == (arr.size() - 1)) {

					System.out.println((i + 2) + "- Quit");
				}
			}
			System.out.println();
			int num = Validator.getInt(scan, "Which car would you like? ", 1, 7);
			if (num > arr.size()) {
				System.out.println("Have a great day!");
				break;
			}
			System.out.println(arr.get((num - 1)));
			ans = Validator.getString(scan, "Would you like to buy this car? y/n ");
			if (ans.equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will contact you shortly");
				System.out.println();
				arr.remove((num - 1));
			} else {
				System.out.println("That's too bad. You make poor life choices");
				System.out.println();
			} 
		}
		
		
		
	}

}
