package core_java_practice.com.practice.practice.scenario_questions.advanced;

import java.util.Scanner;

public class LoanSystem {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter loan amount: ");
	        double P = sc.nextDouble();

	        System.out.print("Enter annual interest rate (%): ");
	        double annualRate = sc.nextDouble();

	        System.out.print("Enter time (in years): ");
	        int years = sc.nextInt();

	        double R = annualRate / 12 / 100;   // monthly interest
	        int N = years * 12;                 // months

	        double EMI = (P * R * Math.pow(1 + R, N)) / 
	                     (Math.pow(1 + R, N) - 1);

	        System.out.println("Monthly EMI: " + EMI);
	 }      

}
