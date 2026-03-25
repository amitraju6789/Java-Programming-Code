package core_java_practice.com.practice.practice.direct_questions.intermidate.copy;

public class Swaptwonumbers {
	public static void main(String args[]) {
		int a = 10;
		int b = 3;
		System.out.println("Before swap: a = "+a+", b = "+ b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: a = "+a+", b = "+ b);
				
	}
}