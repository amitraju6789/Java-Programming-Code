package core_java_practice.com.practice.practice.direct_questions.advance.copy;

public class CountDigitsinaNumber {
	public static void main(String args[]) {
		int count = 0;
		int ans = 12345;
		if (ans == 0) {
			System.out.print(1);
		}
		while(ans != 0) {
			ans/=10;
			count++;
		}
		System.out.println("Number of digits: " + count);
			
	}

}
