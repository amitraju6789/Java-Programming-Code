package core_java_practice.com.practice.practice.scenario_questions.advanced;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total cart amount: ");
        double amount = sc.nextDouble();

        double gstRate = 0.18; // 18% GST
        double gst = amount * gstRate;
        double finalBill = amount + gst;

        System.out.println("Cart Amount: " + amount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill: " + finalBill);
	}    

}
