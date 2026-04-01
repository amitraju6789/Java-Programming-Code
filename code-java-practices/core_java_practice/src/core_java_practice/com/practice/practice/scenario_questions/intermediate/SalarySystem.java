package core_java_practice.com.practice.practice.scenario_questions.intermediate;

import java.util.Scanner;

public class SalarySystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter monthly salary: ");
		double monthlysalary = sc.nextDouble();
		
		double yearlysalary = monthlysalary*12;
		System.out.println("Yearly salary: " + yearlysalary);
	}

}
