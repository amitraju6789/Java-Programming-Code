package core_java_practice.com.practice.practice.scenario_questions.beginner;

import java.util.Scanner;

public class PrintPrice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many price you want to add: ");
		int n = sc.nextInt();
		
		int price[] = new int[n];
		for(int i=0;i<n;i++) {
			price[i] = sc.nextInt();
		}
		
		System.out.println("Price printed---");
		for(int d:price) {
			System.out.println(d);
		}
	}
}