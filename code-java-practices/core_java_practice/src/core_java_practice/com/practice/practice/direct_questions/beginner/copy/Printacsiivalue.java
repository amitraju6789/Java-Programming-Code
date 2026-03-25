package core_java_practice.com.practice.practice.direct_questions.beginner.copy;

import java.util.Scanner;

public class Printacsiivalue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size you want to convert value to ASCII: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int ascii = sc.nextInt();
			System.out.println("Character is: " +(char)ascii);
		}
	}

}
