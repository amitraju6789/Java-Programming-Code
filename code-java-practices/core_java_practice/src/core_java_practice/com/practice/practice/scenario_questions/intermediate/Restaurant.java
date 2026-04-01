package core_java_practice.com.practice.practice.scenario_questions.intermediate;

import java.util.Scanner;

public class Restaurant {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food bill payment: ");
		double amount = sc.nextDouble();
		
		double taxRate = 0.18;
		double tax = amount * taxRate;
		double total = amount + tax;
		
		System.out.println("Food amount: " + amount);
		System.out.println("Tax (18%): " + tax);
		System.out.println("Total bill: " + total);
	}

}
