package core_java_practice.com.practice.practice.direct_questions.advance.copy;

import java.util.Scanner;

public class ReverseaNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Reverse a num: ");
		int num = sc.nextInt();
		int reverseNum = 0;
		 
		while(num !=0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num/=10;
		}
		System.out.println("Reversed Num" + reverseNum);
	}

}
