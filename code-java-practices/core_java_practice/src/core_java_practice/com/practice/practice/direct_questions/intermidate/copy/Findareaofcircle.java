package core_java_practice.com.practice.practice.direct_questions.intermidate.copy;

import java.util.Scanner;

public class Findareaofcircle {
	public static void main(String args[]) {
		
		/* double radius = 5.0; 
		 * double area = Math.PI * radius * radius;
		 * System.out.println("Area of the circle = " + area);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle: " + area);
	}

}
