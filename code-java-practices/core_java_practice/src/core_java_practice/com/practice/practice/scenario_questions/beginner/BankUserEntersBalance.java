package core_java_practice.com.practice.practice.scenario_questions.beginner;

import java.util.Scanner;

public class BankUserEntersBalance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Bank users enter a balance: ");
			double balance = sc.nextDouble();
			
			System.out.println("Your bank balance is:" + balance);
	}

}
