package core_java_practice.com.practice.practice.direct_questions.intermidate.copy;

import java.util.Scanner;

public class ConvertCelsiustoFahrenheit {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in celesius: ");
		double celesius = input.nextDouble();
		double fahrenheit = (celesius * 1.8)+32;
		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	}

}
