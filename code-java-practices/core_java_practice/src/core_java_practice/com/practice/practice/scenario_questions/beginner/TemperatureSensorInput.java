package core_java_practice.com.practice.practice.scenario_questions.beginner;

import java.util.Scanner;

public class TemperatureSensorInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the temprature value: ");
			float temp = sc.nextFloat();
			
			System.out.println("Temperature is " + temp + "c");
	}

}
