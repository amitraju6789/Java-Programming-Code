package core_java_practice.com.practice.practice.scenario_questions.beginner;

import java.util.Scanner;

public class EntersAge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = sc.nextInt();
		
		if(age>=0 & age <= 18) {
			System.out.println("Young");
		}else if(age>=18 & age <= 20) {
			System.out.println("Teenager");
		}else if(age>=20) {
			System.out.println("old");
		}else {
			System.out.println("Invalid age");
		}
		sc.close();
		
	}

}
