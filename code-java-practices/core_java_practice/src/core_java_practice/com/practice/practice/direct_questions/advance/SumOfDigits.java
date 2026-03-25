package core_java_practice.com.practice.practice.direct_questions.advance;

public class SumOfDigits {
	public static void main(String arghs[]) {
		int n = 12335;
		int sum = 0;
		while (n!=0) {
			sum += n%10;
			n/=10;
			
		}
		System.out.println("Sum of digits: " + sum);
	}

}
