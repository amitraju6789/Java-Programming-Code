package core_java_practice.com.practice.practice.direct_questions.intermidate;

import java.util.Scanner;

public class Calculatesimpleinterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the principal amount: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of interest (per annum):");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time periods(in years):");
		double time = sc.nextDouble();
		
		// calculate simple interest
		double simpleInterest = (principal * rate * time)/100;
		System.out.printf("Simple Interest = %.2f%n", simpleInterest);
	}

}
