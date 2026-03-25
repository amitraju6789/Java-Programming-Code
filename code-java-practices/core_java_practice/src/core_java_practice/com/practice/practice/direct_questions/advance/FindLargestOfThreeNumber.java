package core_java_practice.com.practice.practice.direct_questions.advance;

import java.util.Scanner;

public class FindLargestOfThreeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int largest = Math.max(a, Math.max(b, c));
		System.out.println("The largest num is: " + largest);
		sc.close();
	}
}	