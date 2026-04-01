package core_java_practice.com.practice.practice.scenario_questions.advanced;

import java.util.Scanner;

public class OnlineStore { 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total amount: ");
		
		double amount = sc.nextDouble();
		
		double discount = 0;
		if(amount > 1000) {
			discount = amount * 0.10;
		}
		double finalamount = amount - discount;
		
		System.out.println("Original amount: " + amount);
		System.out.println("Discount: " + discount);
		System.out.println("Final amount to pay: " + finalamount);
	}

}
