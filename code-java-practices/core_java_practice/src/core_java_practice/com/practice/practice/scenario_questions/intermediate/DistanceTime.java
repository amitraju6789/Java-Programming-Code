package core_java_practice.com.practice.practice.scenario_questions.intermediate;

import java.util.Scanner;

public class DistanceTime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance(in km): ");
		double distance = sc.nextDouble();
		
		System.out.println("Enter time(in hours): ");
		double time = sc.nextDouble();
		
		double speed = distance / time;
		System.out.println("Speed is: " + speed+ "km/h");
	}

}
