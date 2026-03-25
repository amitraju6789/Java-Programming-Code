package core_java_practice.com.practice.practice.direct_questions.advance.copy;

public class CheckPalindromeNumber {
	public static void main(String args[]) {
		
		 /* int num = 121; 
		 * int original = num;
		 * int reverse = 0;
		 * 
		 * while(num!=0) { 
		 * int digit = num % 10; 
		 * reverse = reverse * 10 + digit;
		 * num/=10; 
		 * } 
		 * if (original == reverse) {
		 * System.out.println("palindrome number"); 
		 * }else {
		 * System.out.println("Not palinedrome number"); }
		 */
		
		int num = 122;
		String str = String.valueOf(num);
		String rev = new StringBuilder(str).reverse().toString();
		
		if (str.equals(rev)) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindorme number");
		}
	}

}
