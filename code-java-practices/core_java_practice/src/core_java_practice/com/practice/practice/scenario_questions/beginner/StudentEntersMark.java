package core_java_practice.com.practice.practice.scenario_questions.beginner;

import java.util.Scanner;

public class StudentEntersMark {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student enter your marks: ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		for(int i = 0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Display the marks");
		for(int d:marks) {
			System.out.println(d);
		}
	}
	
}
