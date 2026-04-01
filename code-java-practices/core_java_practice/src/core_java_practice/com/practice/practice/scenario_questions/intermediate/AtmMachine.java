package core_java_practice.com.practice.practice.scenario_questions.intermediate;

import java.util.Scanner;

public class AtmMachine {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double balance = 10000;
		System.out.println("Enter amount to withdraw: ");
		double withdraw = sc.nextDouble();
		if(withdraw<=balance) {
			balance = balance - withdraw;
			System.out.println("Transcation successful");
			System.out.println("Remaining balance: " + balance);
		}else {
			System.out.println("Insufficient balance");
		}
		
	}

}
